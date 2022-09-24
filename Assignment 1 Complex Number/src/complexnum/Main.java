package complexnum;

public class Main {

	public static ComplexNum sum(ComplexNum c1, ComplexNum c2)
	{
		ComplexNum temp = new ComplexNum (0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;

		return temp;
	}

	public static ComplexNum sub(ComplexNum c1, ComplexNum c2)
	{
		ComplexNum temp1 = new ComplexNum (0,0);
		temp1.real = c1.real - c2.real;
		temp1.img = c1.img - c2.img;

		return temp1;
	}
	
	public static ComplexNum multi(ComplexNum c1, ComplexNum c2)
	{
		ComplexNum temp2 = new ComplexNum (0,0);
		temp2.real = c1.real*c2.real - c1.img*c2.img;
		temp2.img = c2.real*c1.img + c1.real*c2.img;

		return temp2;
	}
	
	public static ComplexNum divi(ComplexNum c1, ComplexNum c2)
	{
		ComplexNum temp3 = new ComplexNum (0,0);
		temp3.real = ((c1.real*c2.real) + (c1.img*c2.img))/(((Math.pow(c2.real, 2))+(Math.pow(c2.img, 0))));
		temp3.img = ((c2.real*c1.img) - (c1.real*c2.img))/(((Math.pow(c2.real, 2))+(Math.pow(c2.img, 0))));

		return temp3;
	}
	
	
	
	
public static void main(String args[])
{
	ComplexNum c1 = new ComplexNum (1,3);
	ComplexNum c2 = new ComplexNum (2,1);
	ComplexNum temp = sum (c1, c2);
	ComplexNum temp1 = sub (c1, c2);
	ComplexNum temp2 = multi (c1, c2);
	ComplexNum temp3 = divi (c1, c2);


    System.out.printf("Addition  is : "+ temp.real +"+"+temp.img + "i\n" );
    System.out.printf("Subtraction  is : "+ temp1.real +"+"+temp1.img + "i\n");
    System.out.printf("Multiplication  is : "+ temp2.real +"+"+temp2.img + "i\n");
    System.out.printf("Division  is : "+ temp3.real +"+"+temp3.img + "i\n");

	}
		

}
	