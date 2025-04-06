package assignment11;
import java.util.Scanner;

abstract class Employee{
	String name;
	int id;
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
	}
	
	public abstract double calculatePay();
}

class HourlyEmployee extends Employee{
	double hourlyRate;
	int hoursWorked;
	
	public HourlyEmployee(String name,int id,double hourlyRate,int hoursWorked) {
		super(name,id);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	
	public double calculatePay() {
		return hourlyRate*hoursWorked;
	}
}

class SalariedEmployee extends Employee{
	double monthlySalary;
	
	public SalariedEmployee(String name,int id,double monthlySalary) {
		super(name,id);
		this.monthlySalary=monthlySalary;
	}
	
	public double calculatePay() {
		return monthlySalary;
	}
}

public class EmployeeTest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of Employees: ");
		int n=sc.nextInt();
		sc.nextLine();
		Employee[] employees=new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter details for Employees #"+(i+1));
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			System.out.print("Enter ID: ");
			int id=sc.nextInt();
			System.out.print("Is the employee hourly or salaried?(h/s): ");
			char type = sc.next().charAt(0);

            if (type == 'h' || type == 'H') {
                System.out.print("Enter hourly rate: ");
                double rate = sc.nextDouble();

                System.out.print("Enter hours worked: ");
                int hours = sc.nextInt();

                employees[i] = new HourlyEmployee(name, id, rate, hours);
            } else {
                System.out.print("Enter monthly salary: ");
                double salary = sc.nextDouble();

                employees[i] = new SalariedEmployee(name, id, salary);
            }
            sc.nextLine(); 
		}
		System.out.println("\n--- Employee Pay Details ---");
        for (Employee emp : employees) {
            emp.getEmployeeDetails();
            System.out.println("Calculated Pay: " + emp.calculatePay());
            System.out.println("--------------------------");
        }

        sc.close();
	}
}
