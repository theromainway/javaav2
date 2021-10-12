package fr.dauphine.javaavance.td2;

class Main {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		
	
		fille.miage();
	 // on ne peut pas appeler une methode de la classe fille dans la classe mere 
     // (mereFille).miage();
	 //  on fait un cast sur mere fille 	qui devient fille 
		((Fille)mereFille).miage();
		
		 mere.a();
	// avec le cast mere fille est devenue une fille donc appelle la methode de fille
		 mereFille.a();
		 fille.a();
	// le cast dans l'autre sens ne fonctionne pas, toujours une fille car sous classe
		 ((Mere)mereFille).a();
		 mereFille.b(null);
	// si on ne met rien en parametre on prend c de la classe mere etant en public 
		 mereFille.c();
		 mereFille.c(mere);
		 mereFille.c(mereFille);
		 mereFille.c(fille);
		 fille.c(fille);
		
		 mere.d();
		 mereFille.d();
		 fille.d();
		
		 mere.printF();
		 mereFille.printF();
		
		 mereFille.j();
		 mereFille.k();
		 mereFille.l();
		 mereFille.m();
		 //Test exercice 2 
			Expr val = new Value(1337.0);
			System.out.println(val.eval()); 
			
			Expr add = new Add(new Value(327.0), val);
			System.out.println(add.eval()); 
			
			Expr e = new Add(new Value(350.0), add);
			System.out.println(e.eval()); 

}
}