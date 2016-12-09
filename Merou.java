public class Merou extends Poisson {
	public Merou(String nom, Sexe sexe) {
		this.typegen = TypeGeneral.POISSON;
		this.nom = nom;
		this.sexe = sexe;
		this.type = TypePoisson.MEROU;
		this.regime = Regime.CARNIVORE;
	}
}
