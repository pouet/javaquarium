public class Carpe extends Poisson {
	public Carpe(String nom, Sexe sexe) {
		this.typegen = TypeGeneral.POISSON;
		this.nom = nom;
		this.sexe = sexe;
		this.type = TypePoisson.CARPE;
		this.regime = Regime.HERBIVORE;
	}
}
