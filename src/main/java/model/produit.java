package model;

public class produit {
	private int id;
	private String namep;
	private String category;
	private Double price;
	private String image;
	
	
	public produit() {
	}

	
	public produit(int id, String namep, String category, Double price, String image) {
		super();
		this.id = id;
		this.namep = namep;
		this.category = category;
		this.price = price;
		this.image = image;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamep() {
		return namep;
	}

	public void setNamep(String namep) {
		this.namep = namep;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + namep + ", category=" + category + ", price=" + price + ", image="
				+ image + "]";
	}
	
	
}

