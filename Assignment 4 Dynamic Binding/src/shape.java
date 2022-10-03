import java.util.Scanner;

public abstract class shape{
	
	public abstract double compute_area();
    double height;
    double width;
    Scanner input = new Scanner(System.in);
  
    public double getheight() {
    	System.out.println("Enter the Height : ");
    	height = input.nextDouble();
    	return height;
    }
    
    public double getwidth() {
    	System.out.println("Enter the Width : ");
    	width = input.nextDouble();
    	return width;
    }
    
    public void setvalues(double height, double width) 
    {
    	this.height = height ;
    	this.width = width;
    }
    
    
} 

