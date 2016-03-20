import java.io.Serializable;

public class ProduitLiquite extends Produit implements Serializable, Cloneable {

	private static final long serialVersionUID = -4020499611597757899L;

	private int quantite = 10;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
