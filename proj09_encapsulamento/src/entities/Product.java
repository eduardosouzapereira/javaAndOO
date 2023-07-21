package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	// Incluindo construtor padrão
	public Product() {

	}

	// Gerando novo construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Gerando sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// quantity ou this.quantity = 0; (opcional)
	}

	// Encapsulamento - métodos de acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Regra de negócio: quantidade de produto só pode ser alterada por entrada ou
	// saída de estoque
	// public void setQuantity(int quantity) {
	// this.quantity = quantity;
	// }

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