package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster greysonMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 
		double legs = 
		double hair = 
		int noses = 
		boolean hasbellybutton = false;
		String name = "Fuddy Duddy";
		
		myOutput = new MarshmallowOutput();
		greysonMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in MarhmallowMonster.java
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(greysonMonster.toString());
	}
}
