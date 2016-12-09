enum TypePoisson {
	MEROU, THON, CLOWN,
	SOLE, BAR, CARPE
}

public class UsinePoisson {
	public static Poisson creerPoisson(TypePoisson type, String nom, Sexe sexe) {
		switch (type) {
			case MEROU:
				return new Merou(nom, sexe);
			case THON:
				return new Thon(nom, sexe);
			case CLOWN:
				return new Clown(nom, sexe);
			case SOLE:
				return new Sole(nom, sexe);
			case BAR:
				return new Bar(nom, sexe);
			case CARPE:
				return new Carpe(nom, sexe);
		}
		return null;
	}
//		return new Poisson(nom, sexe);
}
