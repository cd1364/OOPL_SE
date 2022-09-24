import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Programmer p[] = new Programmer[3];
	
	for (int i=0; i<3; i++) {
		p[i] = new Programmer();
		
		p[i].getdata();
		
		p[i].display();
		
		p[i].getprogrammer();
		
		p[i].calculator();
		break;
		}
	}
}
