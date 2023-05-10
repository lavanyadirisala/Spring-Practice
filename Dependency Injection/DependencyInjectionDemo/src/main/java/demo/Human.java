package demo;
//XML notation
public class Human  implements Livingbeings {
	private int maxLifeSpan;
//	public Human(int maxLifeSpan){
//		this.maxLifeSpan=maxLifeSpan;
//	}
	public void eats() {
		System.out.print("eats flesh and plants");
	}

	public int getMaxLifeSpan() {
		return maxLifeSpan;
	}

	public void setMaxLifeSpan(int maxLifeSpan) {
		this.maxLifeSpan = maxLifeSpan;
	}
}
