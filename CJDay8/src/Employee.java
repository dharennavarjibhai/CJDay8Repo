import java.util.ArrayList;

public class Employee {
	private String  empname;
	private double Salary;

	Employee()
	{}
	public Employee(String empname, double Salary) {
		super();
	this.empname=empname;
	this.Salary=Salary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
public String toString()
{
	return "empname:" +empname +  "Salary:"+Salary;
}
	
	
	

}
