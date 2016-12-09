public class Thon extends Poisson {
	public Thon(String nom, Sexe sexe) {
		this.typegen = TypeGeneral.POISSON;
		this.nom = nom;
		this.sexe = sexe;
		this.type = TypePoisson.THON;
		this.regime = Regime.CARNIVORE;
	}
}
