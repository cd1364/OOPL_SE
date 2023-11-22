class Asst_Project_Manager extends Employee{
	 
	
	double BP, DA, HRA, PF, SCF, net_salary, gross_salary;
		
		void getasstprojectmanager() {
			System.out.println("Enter Basic Pay : ");
			BP = get.nextDouble();
			
		}
		
		void calculator() {
			DA = (0.97*BP);
			HRA = (0.10*BP);
			PF = (0.12*BP);
			SCF = (0.001*BP);
			
			gross_salary = (BP + DA + HRA);
			net_salary = (gross_salary - PF - SCF);
			
			System.out.println();	
			System.out.println("Basic Pay : "+BP);
			System.out.println("DA : "+DA);
			System.out.println("HRA : "+HRA);
			System.out.println("PF : "+ PF);
			System.out.println("Staff Club Fund : "+ SCF);
			System.out.println("Gross Salary : "+ gross_salary);
			System.out.println("Net Salary : "+ net_salary);
		}
	
}
