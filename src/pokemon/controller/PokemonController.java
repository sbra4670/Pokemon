package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;
import pokemon.view.PokedexFrame;
import pokemon.view.PokemonFrame;

public class PokemonController
{
	private List <Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Zorua());
		pokedex.add(new Zoroark());
		pokedex.add(new Zekrom());
		
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	public String [] convertPokedex()


	{
		String [] names = new String [pokedex.size()];
		
		for(int index = 0; index< pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancmentModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
	}
}
	
