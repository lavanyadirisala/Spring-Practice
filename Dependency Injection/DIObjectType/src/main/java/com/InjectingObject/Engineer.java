package com.InjectingObject;

public class Engineer {
	int id;
	Cheater cheater;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setCheater(Cheater cheater) {
		this.cheater = cheater;
	}
	public void printEngineer() {
		System.out.println("ID of Engineer "+ id);
		System.out.println();
		cheater.printCheaterTechnique();
	}

	
}
