package OO;
import java.util.ArrayList;
import java.util.Comparator;
public class teste {
	public static void main(String[] args) {
		ArrayList<Animal> listaA = new ArrayList <Animal>();
		
		// adicionar animal
		Animal a1 = new Animal("Canis lupus familiaris","Alfredo","Pastor-Alemão" );		
		Animal a2 = new Animal("Canis lupus familiaris","Dolinho","Salsicha");		
		Animal a3 = new Animal("Primates","Junior","Macaco-Prego");		
		Animal a4 = new Animal("Harpia harpyja","Fastão","Harpia Brasileira");		
		Animal a5 = new Animal("Camelus dromedarius","João dromedario da silva","Corcunda");
		listaA.add(a1);
		listaA.add(a2);
		listaA.add(a3);
		listaA.add(a4);
		listaA.add(a5);
		
		
		
//		OrdenaAni ordenaAni = new OrdenaAni();
		listaA.sort((b1, b2) -> (b1.getNomeCintifico().compareTo(b2.getNomeCintifico())) );
		
		
		for (Animal animal : listaA) {		
			System.out.println(animal);
		}
	}
	

//class OrdenaAni implements Comparator<Animal>{
//
//	@Override
//	public int compare(Animal a1, Animal a2) {
//		String compAni1 = a1.getNomeCintifico();
//		String compAni2 = a2.getNomeCintifico();
//		return compAni1.compareTo(compAni2);
//		
//		
//	}
	
}
