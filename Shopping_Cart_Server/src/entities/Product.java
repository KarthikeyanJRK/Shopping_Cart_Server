package entities;
// Generated May 4, 2019 1:53:27 AM by Hibernate Tools 5.3.0.Beta2

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private int id;
	private String name;
	private double price;
	private int quantity;
	private String description;
	private byte[] photo;
	private int feature;
	private int categoryid;
	private int partnerid;

	public Product() {
	}

	public Product(int id, String name, double price, int quantity, String description, byte[] photo, int feature,
			int categoryid, int partnerid) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.photo = photo;
		this.feature = feature;
		this.categoryid = categoryid;
		this.partnerid = partnerid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public int getFeature() {
		return this.feature;
	}

	public void setFeature(int feature) {
		this.feature = feature;
	}

	public int getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getPartnerid() {
		return this.partnerid;
	}

	public void setPartnerid(int partnerid) {
		this.partnerid = partnerid;
	}

}
