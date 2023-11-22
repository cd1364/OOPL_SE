import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int cont = 0;
		a:
		do {	
				System.out.println("--------------------------------------------------");
				System.out.println("1.Array index out of bound exception\n2.Number format exception\n3.Arithmetic exception\n4.Exit");
				System.out.println("\nEnter your choice to check the error : ");
			
				Scanner input = new Scanner(System.in);
				int choice  = input.nextInt();
				
				switch(choice) {
				
				case 1:{
					int []array = {10,20,30,40,50};
					System.out.println("Array : "+ Arrays.toString(array));
					System.out.println("Enter Index : ");
					
					try
					{
						Scanner input1 = new Scanner(System.in);
						int a = input1.nextInt();
						
						System.out.println("\nThe element at index "+ a +" is "+array[a]);
						}
						
						catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println("\nEnter the correct Index !!\n"+e);
						}
				
				break;
				}
				
				case 2:{
					try {
						Scanner input2 = new Scanner(System.in);
						System.out.println("\nEnter First Number : ");
						String a = input2.nextLine();
						int Num1 = Integer.parseInt(a);
						
						System.out.println("Enter Second Number : ");
						String b = input2.nextLine();
						int Num2 = Integer.parseInt(b);
						
						
						System.out.println("\nDivision of Numbers : "+ (Num1/Num2));
						}
						
						catch(NumberFormatException e) {
							System.out.println("\nEnter Number in Valid Format...\n"+e);
						}
				break;
				}
				
				case 3:{
					try {
						Scanner input3 = new Scanner(System.in);
						System.out.println("\nEnter First Number : ");
						int Num1 = input3.nextInt();
								
						System.out.println("Enter Second Number : ");
						int Num2 = input3.nextInt();
						
						double c = Num1 / Num2 ;
						
						System.out.println("\nDivision of Numbers : "+ c);
						}
						
						catch(ArithmeticException e)
						{
							System.out.println("\nNumber at Denominator cannot be Zero...\nEnter valid Denominator ..."+e);
						}
				break;	
				}
				
				case 4:{
					cont = 0;
					System.out.println("\nThank you!!");
					break a;
				}
				
				default:
					{
						System.out.println("\nInvalid Input!!");
					}
				}
		}while(cont <= 4);
	}

}
