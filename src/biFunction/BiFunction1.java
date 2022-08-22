package biFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;
class Employee{
	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
}

public class BiFunction1 {
	public static void main(String[] args) {
		
		BiFunction<Integer,String,Employee> bf=(id,name)->new Employee(id,name);
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(bf.apply(1001, "durga"));
		l.add(bf.apply(1002, "rahul"));
		l.add(bf.apply(1003, "raju"));
		l.add(bf.apply(1004, "ajeem"));
		for(Employee e:l) {
			System.out.println("eid"+e.id);
			System.out.println("ename"+e.name);
		}
	}

}
