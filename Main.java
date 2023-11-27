import java.util.ArrayList;
import java.util.List;
public class Main{
	public static void main(String[] args){
		List<Product> productList = new ArrayList<>();
		productList.add(new BottleOfWater("qwe", 123, 100));
		productList.add(new BottleOfWater("ads", 200, 150));
		productList.add(new BottleOfWater("zxcg", 500, 1000));
		productList.add(new BottleOfWater("qaffwe", 123, 10));
		BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
		
	
}