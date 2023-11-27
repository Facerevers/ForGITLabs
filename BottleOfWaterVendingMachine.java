import java.util.List;
import java.util.ArrayList;
public class BottleOfWaterVendingMachine implements VendingMachine{
	private List<Product> productList = new ArrayList<>();
	@Override
	public void initProduct(List<Product> productList){
		this.productList = productList;
	}
	@Override
	public Product getProduct(String name){
		for(Product item : productList)
			if(item.getName().equals(name))
				return item;
		return null;
	}
	public Product getProduct(String name, int volume){
		for(Product item : productList)
			if(item.getName().equals(name) && ((BottleOfWater) item).getVolume() == volume)
				return item;
		return null;
	}
}