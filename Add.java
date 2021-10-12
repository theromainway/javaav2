package fr.dauphine.javaavance.td2;

public class Add extends Expr {
	private Value value; 
	private Expr val; 
	
	

	public Add(Value value, Expr v) {
		this.value=value; 
		this.val=v; 	
	}
	
	 @Override
	 public double eval() {
		double resultat=0.0; 
		resultat= value.eval()+val.eval(); 
		return resultat; 
		 
	 }
	

}