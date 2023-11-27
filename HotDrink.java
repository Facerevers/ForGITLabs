public class HotDrink extends BottleOfWater{
	private int temperature;
	public HotDrink(String name, int cost, int volume, int temperature){
		super(name, cost, volume);
		this.temperature = temperature;
	}
	public int getTemperature(){
		return temperature;
	}
	
}