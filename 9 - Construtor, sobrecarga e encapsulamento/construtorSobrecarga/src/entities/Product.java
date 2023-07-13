package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Incluindo construtor padrão
	public Product() {
		
	}
	
	//Gerando novo construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//Gerando sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//quantity ou this.quantity = 0; (opcional)
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}