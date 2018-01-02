package pokemon.model;

public class Zekrom extends Pokemon implements Electric, Dragon
{

	public Zekrom(int number, String name)
	{
		super(number, name);

	}

	public String FusionBolt()
	{
		return "KABOOOOOOOOOOOMMMMMMMMM!";
	}
	
	public String Thunder()
	{
		return "*Rumbling*";
	}
	
	public String BoltStrike()
	{
		return "WHOOOOOSH";
	}
}
