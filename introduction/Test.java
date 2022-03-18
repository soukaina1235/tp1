package ma.education.tp1.introduction;

public class Test {

	public static void main(String [] args ) {
		
		
		
		// OBJET (O1), OBJET(O2), OBJET (O3)
		
		Salle o1=new Salle();
		
		Salle o2=new Salle("Salle Informatique");
		
		Salle o3=new Salle("Salle des cours");
		
		System.out.println(o1.id+" "+o1.nom);
		System.out.println(o2.id+" "+o2.nom);
		System.out.println(o3.id+" "+o3.nom);

		
		
		}
	
}
