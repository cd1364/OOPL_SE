package factoryDP;

public class CarFactory {

	public static Car buildCar(CarType model){
		Car car = null;
		
		switch(model)
		{
		case HATCHBACK:
			car = new Hatchback();
			break;
			
		case SEDAN:
			car = new Sedan();
			break;

		case SUV:
			car = new SUV();
			break;

		}	
		return car;
	}
	
}
