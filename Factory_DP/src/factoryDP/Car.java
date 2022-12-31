package factoryDP;

public abstract class Car {

	public Car(CarType model) {
		
		this.model = model;
		arrangeParts();
		
	}
	private void arrangeParts()
	{}
	
	protected abstract void construct();
	
	private CarType model = null;
	
	public CarType getmodel()
	{
		return model;
	}
	
	public void setmodel(CarType model)
	{
		this.model = model;
	}

}
