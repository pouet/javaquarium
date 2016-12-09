public class Clown extends Poisson {
	public Clown(String nom, Sexe sexe) {
		this.typegen = TypeGeneral.POISSON;
		this.nom = nom;
		this.sexe = sexe;
		this.type = TypePoisson.CLOWN;
		this.regime = Regime.CARNIVORE;
	}
}
