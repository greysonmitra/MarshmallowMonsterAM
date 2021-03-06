package marshmallow.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;                               //These are the declarations I think?
	private int monsterNoses;							   //These are actually variables...
	private double monsterHair;                            //But, variables are declared in the declarations section.
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	public MarshmallowMonster()
	{
		monsterName = "";
		monsterEyes = -9999;
		monsterNoses = -9191;
		monsterHair = -.04141;
		monsterLegs = -.0999;
		monsterBellyButton = false; 
				
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton )
	//^^^ This right here is the constructor I think? YES IT IS 
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;             //I think these are the methods or maybe declarations?
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
	}
	
	//Getters and Setters (I did them out of order, but it goes all getters, then all setters)
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;				//If this line said monsterNoses, it would compile correctly, but give a logic error and give the wrong value.
	}
	
	public void setMonsterNoses(int monsterNoses)
	{
		this.monsterNoses = monsterNoses;
	}	
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	/*
	public String toString()
	{
		String monster = " This monster has " + monsterEyes + " eyes, " + monsterHair + " hair, " + monsterNoses + " Noses, " + monsterLegs + " Legs, " + " a " + monsterBellyButton + " bellybutton" + " and its' name is " + monsterName;
		
		return monster;
	}
}
