package fr.dauphine.javaavance.td2;

public class Mere {
	protected int meth() {
		return 42;
		}
		public void printMeth() {
		System.out.println(meth());
		}
		}
		class Fille extends Mere {
		public int meth() {
		return 24;
		}
		}
		class Main {
		public static void main(String[] args) {
		Mere mere = new Mere();
		System.out.println(mere.meth());
		mere.printMeth();
		Fille fille = new Fille();
		System.out.println(fille.meth());
		fille.printMeth();
		Mere mereFille = new Fille();
		System.out.println(mereFille.meth());
		mereFille.printMeth();
		}
}
