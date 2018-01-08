package pokemon.controller;

import javax.swing.JPanel.*;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;

public class PokedexPanel extends JPanel
{	
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;

	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index). getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints()+ "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancmentModifier() + "");
	}
	
	public PokedexPanel(PokemonController appController) 
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("Give Image Icon Location, here.png")), JLabel.CENTER);
		
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		
		pokedexDropdown = new JComboBox();
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		
		descriptionArea = JTextArea(5, 10);
		typeArea = newJTextArea(4,15);
		
		firstType = newJPanel();
		secondType = newJPanel(); 
		thirdType = newJPanel();
		fourthType = newJPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
		
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		PokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50,50);
		fourthType.setSize(50, 50);
	}

	private void setupPanel()
	{
		
	}
	
	private void updateImage()
	{
		
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		//Change this to match your 3 minimum Types in your Pokedex
		if(types[0].equals("Electric"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		
		else if (types[0].equals("Dragon"))
		{
			firstType.setBackground(Color.BLUE);
		}
		
		else if (types[0].equals("Dark"))
		{
			firstType.setBackground(Color.BLACK);
		}
		
		else 
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if(types.length > 1)
		{
			if(types[1].equals("Electric"))
			{
				secondType.setBackground(Color.YELLOW);
			}
			//...Continue "types[1] by adding dragon and electric
			
			if (types.length == 3)
			{
				if (types[2].equals("Electric"))
				{
					thirdType.setBackground(Color.YELLOW);
				}
				//...continue as above
			}
		}
	}
		// Set this for each of the different type panels
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
}
 