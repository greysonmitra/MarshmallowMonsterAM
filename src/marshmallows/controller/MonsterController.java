package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster greysonMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 8;
		double hair = 1;
		int noses = 1;
		boolean hasbellybutton = false;
		String name = "Fuddy Duddy";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		greysonMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in MarhmallowMonster.java
	}
	public void start()
	{
		myOutput.displayMonsterInfo(greysonMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info:" + greysonMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		greysonMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		greysonMonster.setMonsterEyes(betterMonsterEyes);
		System.out.println("Type in a different number of noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		greysonMonster.setMonsterNoses(betterMonsterNoses);
		System.out.println("Type in a different number of hair for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		greysonMonster.setMonsterHair(betterMonsterHair);
		System.out.println("Type in a new number for the monster's legs");
		double betterMonsterLegs = monsterScanner.nextDouble();
		greysonMonster.setMonsterLegs(betterMonsterLegs);
		
	}
}
