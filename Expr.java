package fr.dauphine.javaavance.td2;

public abstract class Expr {
	
	private double value; 
	private String add; 
	
	
	
	public double eval() {
		return this.value; 
			
	}



	public String getAdd() {
		return add;
	}



	public void setAdd(String add) {
		this.add = add;
	}
	


}