package pokemon.controller;

import javax.swing.JPanel.*;
import javax.swing.JLabel;
import javax.swing.*;

public class PokedexPanel extends JPanel
{	
	private PokemonController appController;
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
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
		nameField = new JTexField("name");
		numberField = new JtextField('##');
		
		
	}
}
 