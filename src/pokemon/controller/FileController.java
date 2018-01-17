package pokemon.controller;

import java.util.ArrayList;
import pokemon.controller.*;
import pokemon.model.*;
import pokemon.view.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import pokemon.model.Pokemon;

public class FileController
{
	public static void savePokemonToFile(ArrayList<Pokemon> pokedex)
	{
		File saveFile = new File("Saved Pokedex.txt");
		try
		{
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			for (int index = 0; index<pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number =  pokedex.get(index).getNumber();
				int attack = pokedex.get(index).getAttackPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evolve = pokedex.get(index).isCanEvolve();
				double modify = pokedex.get(index).getEnhancmentModifier();
				
				String row = name + ";" + health + ";" + attack + ";" + modify + ";" + evolve;
				
				writeToDisk.println(row);
			}
			writeToDisk.close();
		}
		catch(FileNotFoundException error)
		{
			System.out.println("There was an error:" + error.getMessage());
		}
	}
}
