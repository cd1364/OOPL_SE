# OOPL_SE
SE IT SPPU (2019 pattern) OOPL assignments

# Course Outcome
CO1: Differentiate various programming paradigms.

CO2: Identify classes, objects, methods, and handle object creation, initialization, and destruction to model real-world problems. 

CO3: Identify relationship among objects using inheritance and polymorphism. 

CO4: Handle different types of exceptions and perform generic programming. 

CO5: Use file handling for real world application. 

CO6: Apply appropriate design patterns to provide object-oriented solutions.

# Problem Statements
1.Classes and object -- CO1 and CO2
Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and 
Parameterized constructors. Write a program to perform arithmetic operations of two complex 
numbers.

2. Polymorphism -- CO3
Identify commonalities and differences between Publication, Book and Magazine classes. Title, 
Price, Copies are common instance variables and saleCopy is common method. The differences 
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, 
receiveissue().Write a program to find how many copies of the given books are ordered and 
display total sale of publication. 

3.Inheritance -- CO3
Design and develop inheritance for a given case study, identify objects and relationships and 
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, 
Curriculum for Second Year of Information Technology (2019 Course), Savitribai Phule Pune University
Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project 
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the 
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff 
club fund. Generate pay slips for the employees with their gross and net salary.

4.Dynamic Binding -- CO3
Design a base class shape with two double type values and member functions to input the data 
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make 
compute_area() as abstract function and redefine this function in the derived class to suit their 
requirements. Write a program that accepts dimensions of triangle/rectangle and display 
calculated area. Implement dynamic binding for given case study.

5.Interface -- CO1, CO3
Design and develop a context for given case study and implement an interface for Vehicles 
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common 
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all 
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these 
functionalities in their own class in their own way.

6.Exception handling -- CO4
Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters 
two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 
are not integers, the program would throw a Number Format Exception. If Num2 were zero, the 
program would throw an Arithmetic Exception. Display the exception.

7.Template -- CO4
Implement a generic program using any collection class to count the number of elements in a 
collection that have a specific property such as even numbers, odd number, prime number and 
palindromes. 

8.File Handling -- CO5
Implement a program for maintaining a database of student records using Files.
Student has Student_id,name, Roll_no, Class, marks and address. Display the data for few 
students.
1. Create Database
2. Display Database 
3. Delete Records
4. Update Record
5. Search Record

9.Case Study -- CO2, CO5
Using concepts of Object-Oriented programming develop solution for any one application
1) Banking system having following operations :
1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit
5. Check the balance 6. Display Account information.

2) Inventory management system having following operations :
1. List of all products 2. Display individual product information 3. Purchase 4. Shipping
5. Balance stock6. Loss and Profit calculation.

10. Factory Design Pattern -- CO6
Implement Factory design pattern for the given context. Consider Car building process, which 
requires many steps from allocating accessories to final makeup. These steps should be written as 
methods and should be called while creating an instance of a specific car type. Hatchback, Sedan, 
SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and Test Factory
Pattern should be implemented.

11. Strategy Design Pattern -- CO6
Implement and apply Strategy Design pattern for simple Shopping Cart where three payment 
strategies are used such as Credit Card, PayPal, Bit Coin. Create an interface for strategy pattern 
and give concrete implementation for payment.
