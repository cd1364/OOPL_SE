package factoryDP;

public class SUV extends Car{
	
	SUV()
	{
		super(CarType.SUV);
		construct();
	}
	
	@Override
	protected void construct()
	{
		System.out.println("Building New Cars");
	}
}
