package fr.dauphine.javaavance.td2;

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