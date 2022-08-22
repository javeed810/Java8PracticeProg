package FunctionFunction;

import java.util.function.*;

class Student1{
	String name;
	int marks;
	Student1(String name,int marks){
		this.name=name;
		this.marks=marks;
}
}
public class FunctionWithPredicate {
	public static void main(String[] args) {
		Function<Student1,String> f=s-> {
				int marks=s.marks;
				String grade="";
				if(marks>=80) grade="A[Distinction";
				else if(marks>=60) grade="B First class";
				else if(marks>=50) grade="C Second class";
				else if(marks>=35) grade="D Third class";
				else grade="E Failed";
				return grade;
		};
		Student1[] s= {new Student1("javeed",100),new Student1("ahmad",75),new Student1("haneef",55),
						new Student1("junaid",35),new Student1("Raju",30)};
		Predicate<Student1> p=s1->s1.marks>=60;
	for(Student1 s1:s) {
		if(p.test(s1)) {
			System.out.println("Name: "+s1.name);
			System.out.println("Marks: "+s1.marks);
			System.out.println("Grade: "+f.apply(s1));
			System.out.println();
			}
		}
	}
}
