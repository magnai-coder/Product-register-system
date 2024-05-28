
public class Product {
	private int pic;
	private String id;
	private String name;
	private double price;
	public Product(int kod, String ner, String turul, double une) { 
		this.pic=kod;
		id=ner;
		name=turul;
		price = une;
	}

public int getPic() { return pic;}
public String getId() { return id;}
public String getName() { return name;}
public double getPrice() { return price;}
}
	
