public class App4 {

	public static void main(String[] args) {
		// classe Produit doit impl�ment� les deux interface Serializable et Clonable pour march�
		// C'est une contrainte indiqu� dans la classe Traitement
		Traitement<ProduitLiquite> t = new Traitement<>(new ProduitLiquite(), new ProduitLiquite());
		System.out.println(t.getA().getQuantite() + " - " + t.getB().getQuantite());
	}
}
