package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster greysonMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 8;
		double hair = 1;
		int noses = 1;
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
