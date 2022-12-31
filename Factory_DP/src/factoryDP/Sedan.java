package factoryDP;

public class Sedan extends Car{
	
	Sedan()
	{
		super(CarType.SEDAN);
		construct();
	}
	
	@Override
	protected void construct()
	{
		System.out.println("Building New Cars");
	}
}
