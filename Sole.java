public class Sole extends Poisson {
	public Sole(String nom, Sexe sexe) {
		this.typegen = TypeGeneral.POISSON;
		this.nom = nom;
		this.sexe = sexe;
		this.type = TypePoisson.SOLE;
		this.regime = Regime.HERBIVORE;
	}
}
