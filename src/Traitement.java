import java.io.Serializable;

public class Traitement<T extends Produit & Serializable & Cloneable> { // seulement les types qui h�ritent de produit// & = implements

	private T a;

	private T b;

	public Traitement() {
		super();
	}

	public Traitement(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

}
