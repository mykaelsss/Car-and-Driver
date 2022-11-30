package codingdojo.java.cardriver;

public class Car {
	
	private int gas = 10;
	
	public Car() {
		
	}
	
	public int getGas() {
		return this.gas;
	}
	public void setGas(int addedGas) {
		this.gas += addedGas;
	}
	
	public int displayGas() {
		return getGas();
	}
}
