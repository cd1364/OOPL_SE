package factoryDP;

public class Hatchback extends Car{
	
	Hatchback()
	{
		super(CarType.HATCHBACK);
		construct();
	}
	
	@Override
	protected void construct()
	{
		System.out.println("Building New Cars");
	}
}
