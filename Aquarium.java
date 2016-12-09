import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Aquarium {
	private List<Poisson> poisson;
	private List<Algue> algue;

	public Aquarium() {
		poisson = new LinkedList<Poisson>();
		algue = new LinkedList<Algue>();
	}

	public void ajoutePoisson(TypePoisson type, String nom, Sexe sexe) {
		this.poisson.add(UsinePoisson.creerPoisson(type, nom, sexe));
	}

	public void ajouterAlgue() {
		algue.add(new Algue());
	}

	private void effectuerAction() {
	}

	public void passer() {
		effectuerAction();

		System.out.println("Il y a " + algue.size() + " algues");
		for (Poisson it : poisson) {
			System.out.println(it);
		}
	}
}
