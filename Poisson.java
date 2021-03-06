enum Sexe {
	MALE ("male"), FEMELLE ("femelle");

	private String sex = "";

	Sexe(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return sex;
	}
}

enum Regime {
	CARNIVORE, HERBIVORE;
}

public abstract class Poisson extends EtreVivant {
	protected String nom;
	protected Sexe sexe;
	protected TypePoisson type;
	protected Regime regime;

	public void manger(EtreVivant etre) {
		if (etre instanceof Poisson && this.regime == Regime.CARNIVORE) {
			Poisson p = (Poisson)etre;
			System.out.println(this.nom + " mange " + p.nom);
		}
		else if (etre instanceof Algue && this.regime == Regime.HERBIVORE) {
			System.out.println(this.nom + " mange une algue");
		}
		else {
			System.out.println(this.nom + " ne peux pas manger ca !");
		}
	}

	public String toString() {
		return "Poisson : " + nom + " - " + sexe;
	}
}
