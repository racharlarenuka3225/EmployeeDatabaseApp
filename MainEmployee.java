package advJava;


	import java.util.*;

	public class MainEmployee {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EmployeeDAO dao = new EmployeeDAO();

	        while (true) {
	            System.out.println("\n=== Employee Database App ===");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employees");
	            System.out.println("3. Update Salary");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = sc.next();
	                    System.out.print("Enter Department: ");
	                    String dept = sc.next();
	                    System.out.print("Enter Salary: ");
	                    double salary = sc.nextDouble();
	                    dao.addEmployee(new Employee(0, name, dept, salary));
	                    break;
	                case 2:
	                    for (Employee e : dao.getAllEmployees()) {
	                        System.out.println(e);
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter Employee ID: ");
	                    int idU = sc.nextInt();
	                    System.out.print("Enter New Salary: ");
	                    double newSal = sc.nextDouble();
	                    dao.updateEmployee(idU, newSal);
	                    break;
	                case 4:
	                    System.out.print("Enter Employee ID to delete: ");
	                    int idD = sc.nextInt();
	                    dao.deleteEmployee(idD);
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	}