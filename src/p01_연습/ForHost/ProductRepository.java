package p01_연습.ForHost;

public class ProductRepository {

	private Product[] productTable;
	
	public ProductRepository(Product[] productTable) {
		this.productTable = productTable;
	}
	
	private void saveProduct(Product product) {
		arrayExtend();
		productTable[productTable.length - 1] = product;
	}
	
	private void arrayExtend() {
		Product[] newArray = new Product[productTable.length + 1];
		copyArray(newArray, productTable);
		this.productTable = newArray;
	}
	
	private void copyArray(Product[] newArray, Product[] oldArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}

	public Product[] getProductTable() {
		return productTable;
	}
	
	
	
	
	

}
