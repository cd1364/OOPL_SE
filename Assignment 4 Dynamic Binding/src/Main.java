import java.util.*;

public class Main{
    public static void main(String args[])
    {
    	int choice , cont;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("## AREA CALCULATOR ##");
            System.out.print("\nSelect The Shape :\n1.Rectangle\n2.Triangle\n\nYour Choice: ");
            
            choice = sc.nextInt();
            if(choice == 1)
            {
                shape sh = new rectangle();
                System.out.println("\nThe Area Of Rectangle is : "+ sh.compute_area());
            }
            else
            {
                shape sha = new triangle();
                System.out.println("\nThe Area Of Triangle is : "+ sha.compute_area());
            }
            System.out.println("\nEnter 0 to Exit or 1 to Continue.");
            cont = sc.nextInt();
        }while(cont == 1);
    }
    
}