public class Main {
	public static void main(String[] args) {
		Aquarium aq = new Aquarium();

		aq.ajoutePoisson(TypePoisson.THON, "toto", Sexe.MALE);
		aq.ajoutePoisson(TypePoisson.CLOWN, "titi", Sexe.FEMELLE);
		aq.ajoutePoisson(TypePoisson.MEROU, "titi", Sexe.FEMELLE);
		aq.ajoutePoisson(TypePoisson.BAR, "toto", Sexe.MALE);
		aq.ajoutePoisson(TypePoisson.SOLE, "titi", Sexe.FEMELLE);
		aq.ajouterAlgue();
		aq.ajouterAlgue();
		aq.ajouterAlgue();
		aq.ajouterAlgue();

		aq.passer();

		Poisson p = new Bar("toto", Sexe.MALE);
		Poisson q = new Thon("tata", Sexe.MALE);
		Algue r = new Algue();

		p.manger(q);
		p.manger(r);
	}
}
