package com.pace.practice2;

public class City {
	String name,famousFor;
	int population;
	String state;
	public City(String name, String famousFor, int population, String state) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.population = population;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
