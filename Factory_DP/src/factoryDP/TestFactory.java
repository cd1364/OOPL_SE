package factoryDP;

public class TestFactory {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
		System.out.println();
		
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println();
		
		System.out.println(CarFactory.buildCar(CarType.SUV));
		System.out.println();

	}

}
