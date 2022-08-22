package FunctionFunction;

import java.util.function.*;

class Studentt{
	String name;
	int marks;
	public Studentt(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}
public class Combine3FunPFC {
	public static void main(String[] args) {
		Studentt s[]= {new Studentt("javeed",90),new Studentt("ahmad",74),new Studentt("moseen",55),
						new Studentt("rahul",43),new Studentt("ajeem",32)};
		Predicate<Studentt> p=s1->s1.marks>=60;
		Function<Studentt,String> f=s2->{
			int marks=s2.marks;
			String grade="";
			if(marks>=80) grade="Distinction";
			else if(marks>=60) grade="First class";
			else if(marks>=50) grade="Second class";
			else if(marks>=35) grade="Third class";
			else grade="Failed";
			return grade;
		};
		Consumer<Studentt> c=s4->{
			System.out.println("name: "+s4.name);
			System.out.println("marks: "+s4.marks);
			System.out.println(f.apply(s4));
		};
		for(Studentt s5:s) {
			if(p.test(s5))
			{
				c.accept(s5);
			}
		}
		
	}
	}


