

import java.util.*;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class Question3 {

	public static void main(String[] args) {
		List<Product> productList1 = new ArrayList<Product>();
		productList1.add(new Product(101, "Hp Laptop", 50000));
		productList1.add(new Product(102, "Acer Laptop", 50000));
		productList1.add(new Product(103, "Samsung Laptop", 50000));
		List<Product> productList2 = new ArrayList<Product>();
		productList2.add(new Product(111, "Hp Mobile", 10000));
		productList2.add(new Product(112, "Acer Mobile", 10000));
		productList2.add(new Product(113, "Samsung Mobile", 10000));
		List<Product> productList3 = new ArrayList<Product>();
		productList3.add(new Product(111, "Hp TV", 10000));
		productList3.add(new Product(112, "Acer TV", 10000));
		productList3.add(new Product(113, "Samsung TV", 10000));
		
		List<List<Product>> productList = new ArrayList<>();
		productList.add(productList1);productList.add(productList2);productList.add(productList3);
		
		List<Product> finalProdList = new ArrayList<>();
		finalProdList = productList.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
		System.out.println(finalProdList);
	}

}
