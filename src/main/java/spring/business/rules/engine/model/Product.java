package spring.business.rules.engine.model;

public class Product {
	
	//product -  type,     physical product, book , video- “Learning to Ski" 
	
	private String productType;
	
	private String book;
	
	private String video;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
	

}
