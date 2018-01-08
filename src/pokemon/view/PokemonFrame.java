package pokemon.view;

import pokemon.controller.PokedexPanel;
import javax.swing.JFrame;
import pokemon.controller.PokemonController;

public class PokemonFrame
{
	
private PokedexPanel pokePanel;
private PokemonController appController;

public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		this.pokePanel = new PokedexPanel(appController);
	
		setupFrame();
	}

private void setupFrame()
	{

	
	}
}
