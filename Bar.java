public class Bar extends Poisson {
	public Bar(String nom, Sexe sexe) {
		this.typegen = TypeGeneral.POISSON;
		this.nom = nom;
		this.sexe = sexe;
		this.type = TypePoisson.BAR;
		this.regime = Regime.HERBIVORE;
	}
}
