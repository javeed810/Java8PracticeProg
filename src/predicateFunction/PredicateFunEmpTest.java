package predicateFunction;
import java.util.*;
import java.util.function.*;
class Employee{
	String name;
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	/*
	 * @Override public String toString() { return "Employee [name=" + name +
	 * ", salary=" + salary + "]"; }
	 */
	
}
public class PredicateFunEmpTest {
	public static void main(String[] args) {
		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.add(new Employee("Durga",1000));
		ar.add(new Employee("raju",6000));
		ar.add(new Employee("sagar",3000));
		ar.add(new Employee("rahul",2000));
		ar.add(new Employee("venkat",5000));
		ar.add(new Employee("raghu",4000));
		
		Predicate<Employee> p=e->e.salary>3000;
		for(Employee e1:ar)
		{
			if(p.test(e1)) {
				System.out.println(e1.name+":"+e1.salary);
			}
		}
	}
}
