public class Algue extends EtreVivant {
	protected Boolean exist;

	public Algue() {
		this.typegen = TypeGeneral.ALGUE;
		exist = true;
	}

	public String toString() {
		return "Algue : je suis en vie !";
	}
}
