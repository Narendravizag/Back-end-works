package oops1;
class Employees {
	String Name;
	int EmployeeId;
	String Role;
	int Salary;
	String Company;

	void getData() {
		Name = "NARENDRA";
		EmployeeId =123456789;
		Role = "Java Developer";
		Salary = 35000;
		Company = "DELOITTE";

	}

	void show() {
		System.out.println("Name:" + Name + "\n" + "EmployeeId:" + EmployeeId + "\n" + "Role:" + Role + "\n" + "Salary:"
				+ Salary + "\n" + "Compamy:" + Company + "\n");
	}

}

public class employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees E = new Employees();
		E.getData();
		E.show();

	}

}

