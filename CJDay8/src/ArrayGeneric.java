import java.util.ArrayList;
import java.util.Iterator;


public class ArrayGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Anu", 2600.00);
		ArrayList<Employee> employeeList=new ArrayList<>();
	
		employeeList.add(emp);
		
		/*employeeList.add("Shruti");
		employeeList.add("Lucky");*/
		for(Object obj:employeeList)
		{
		System.out.println(obj);
		
		Iterator iterator =employeeList.iterator();
		while(iterator.hasNext())
		{
		String str=(String)iterator.next();
		System.out.println(str);


	}

}}}
