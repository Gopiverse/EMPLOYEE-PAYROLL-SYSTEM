import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        EmployeeCRUD crud=new EmployeeCRUD();

        while(true){

            System.out.println("\n=================================Employee Payroll System=================================");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice=sc.nextInt();
	    int id;
	    System.out.println("---------------------");

            switch(choice){

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name=sc.nextLine();

                    System.out.print("Enter Department : ");
                    String dept=sc.nextLine();

                    System.out.print("Enter Salary : ");
                    double salary=sc.nextDouble();

		    System.out.print("Enter ID : ");
                    id = sc.nextInt();


                    Employee emp=new Employee(id,name,dept,salary);

                    crud.addEmployee(emp);

                    break;

                case 2:

                    crud.displayEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID : ");
                    id=sc.nextInt();

                    crud.searchEmployee(id);

                    break;

                case 4:

                    System.out.print("Enter Employee ID : ");
                    id=sc.nextInt();

                    System.out.print("Enter New Salary : ");
                    salary=sc.nextDouble();

                    crud.updateSalary(id,salary);

                    break;

                case 5:

                    System.out.print("Enter Employee ID : ");
                    id=sc.nextInt();

                    crud.deleteEmployee(id);

                    break;

                case 6:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

}