public class App4 {

	public static void main(String[] args) {
		// classe Produit doit implémenté les deux interface Serializable et Clonable pour marché
		// C'est une contrainte indiqué dans la classe Traitement
		Traitement<ProduitLiquite> t = new Traitement<>(new ProduitLiquite(), new ProduitLiquite());
		System.out.println(t.getA().getQuantite() + " - " + t.getB().getQuantite());
	}
}
