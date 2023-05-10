package com.InjectingObject;

public class OtherEngineer {
	Cheater cheat;
	
	public void setCheat(Cheater cheat) {
		this.cheat= cheat;
	}
	public void printOtherEngineerCheater() {
		cheat.printCheaterTechnique();
	}
}
