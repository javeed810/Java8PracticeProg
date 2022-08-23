package MethodAndConstructorReference;
class Student{
	String name;
	int id;
	int marks;
	Student(String name,int id,int marks){
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
}
	interface Interf7{
		public Student get(String name,int id,int marks);
	}
public class ConstructorRefStudent {
	public static void main(String[] args) {
	
		Interf7 i1=(name,id,marks)->new Student("Durga", 1, 99);
		//i1.get(null, 0, 0);
		Interf7 i=Student::new;
		i.get("soft", 2, 90);
	}

}
