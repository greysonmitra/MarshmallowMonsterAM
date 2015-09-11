package marshmallow.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;                               //These are the declarations I think?
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton )
	//^^^ This right here is the constructor I think?
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;             //I think these are the methods or maybe declarations?
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + " eyes, " + monsterHair + " hair, " + " and its' name is " + monsterName;
		
		return monster;
	}
}
