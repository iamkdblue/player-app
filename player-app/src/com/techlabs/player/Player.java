package com.techlabs.player;

public class Player {

	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
		this.age = 18;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player whoIsElder(Player s) {
		if (this.age < s.age) {
			return s;
		} else
			return this;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = this.id + " " + this.name + " " + this.age;
		return s;
	}

}
