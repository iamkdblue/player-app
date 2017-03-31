package com.techlabs.playerTest;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String args[]) {

		System.out.println(args.length);
		Player sachin = new Player(102, "sachin", 48);

		printInfo(sachin);

		Player virat = new Player(101, "virat");

		printInfo(virat);

		Player elder = virat.whoIsElder(sachin);
		printInfo(elder);

		System.out.println(virat);
		System.out.println(virat.toString());
		System.out.println(sachin);
		System.out.println(sachin.toString());

		// virat.toString();
		System.out.println("hi " + virat.toString());
	}

	private static void printInfo(Player printinfo) {
		System.out.println(printinfo.getId() + " " + printinfo.getAge() + " "
				+ printinfo.getName() + " " + printinfo.hashCode());
	}

}
