

public class App3 {

	public static void main(String[] args) {
		Calcul<String> c = new Calcul<String>();
		double a = 8.9;
		double b = 9.5;
		System.out.println(c.comparer(a, b)); // retourne false

		String x = "azerty";
		String y = "azerty";

		System.out.println(c.comparer(x, y)); // retourne true

		Produit p1 = new Produit();
		Produit p2 = new Produit();
		System.out.println(c.comparer(p1, p2)); // retourne false

	}
}
