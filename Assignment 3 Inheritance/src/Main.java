import java.util.Scanner;

public class Main {
public static void main(String[] args) {


int choice,cont = 0;


do{

   System.out.println("\tMENU");
   System.out.println("\n1.Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager\n5.Exit");

Scanner sc = new Scanner(System.in);

System.out.println("Enter your Choice : ");
choice = sc.nextInt();


switch(choice){

case 1:
    System.out.println("Enter the No. of Employee : ");
int n = sc.nextInt();

for (int i=0; i<n; i++)
{Programmer p[] = new Programmer[3];
p[i] = new Programmer();
p[i].getdata();
p[i].getprogrammer();
System.out.println("-----------------------------");
System.out.println("\nPAYMENT SLIP FOR PROGRAMMER");
System.out.println("----------------------------");
p[i].display();
p[i].calculator();}

break ;



case 2:
System.out.println("Enter the No. of Employee : ");
   int k = sc.nextInt();

for (int j=0; j<k; j++) {
Team_Lead t[] = new Team_Lead[3];
t[j] = new Team_Lead();
t[j].getdata();
t[j].getteamlead();
System.out.println("----------------------------");
System.out.println("\nPAYMENT SLIP FOR TEAM LEAD");
System.out.println("----------------------------");
t[j].display();
t[j].calculator();}
break;

case 3:
System.out.println("Enter the No. of Employee : ");
   int p = sc.nextInt();

for (int i=0; i<p; i++) {
Asst_Project_Manager a[] = new Asst_Project_Manager[3];
a[i] = new Asst_Project_Manager();
a[i].getdata();
a[i].getasstprojectmanager();
System.out.println("---------------------------------------");
System.out.println("\nPAYMENT SLIP FOR ASST. PROJECT MANAGER");
System.out.println("---------------------------------------");
a[i].display();
a[i].calculator();}
break;

case 4:
System.out.println("Enter the No. of Employee : ");
   int q = sc.nextInt();


for (int i=0; i<q; i++) {
Project_Manager m[] = new Project_Manager[3];
m[i] = new Project_Manager();
m[i].getdata();
m[i].getprojectmanager();
System.out.println("---------------------------------------");
System.out.println("\nPAYMENT SLIP FOR PROJECT MANAGER");
System.out.println("---------------------------------------");
m[i].display();
m[i].calculator();}
break;

case 5:
if(true){}
System.exit(0);

default:
System.out.println("\nInvalid Input !!!");
cont = sc.nextInt();
}
System.out.println("\nPlease Enter 0 to Exit Or Enter 1 to Return MENU");

        cont = sc.nextInt();
        if (cont!=1){
            System.out.println("Thank you !!");
            break;
        }
}while(choice <= 4);
   
}

}