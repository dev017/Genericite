import java.io.Serializable;

public class Produit implements Serializable, Cloneable {

	private static final long serialVersionUID = 6468090398198984054L;

	private Long idProduit;

	private String nomProduit;

	private double prix;

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
