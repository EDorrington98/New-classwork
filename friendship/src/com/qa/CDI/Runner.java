package com.qa.CDI;

public class Runner {

	public static void main(String[] args) {
		World world = new World(new Enemy);
		world.run();
	}

}
