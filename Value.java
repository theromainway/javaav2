package fr.dauphine.javaavance.td2;

public class Value extends Expr {
	private double value; 
	
	public Value(double v) {
		this.value=v; 		
	}
	
	 @Override
	 public double eval() {
		 return this.value;
		 
	 }
	 
	

}