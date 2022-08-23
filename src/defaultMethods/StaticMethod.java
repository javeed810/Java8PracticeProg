package defaultMethods;

interface Interf4
{
	public static void m5() {
		System.out.println("static method of interf4");
	}
}
public class StaticMethod implements Interf4 {
	public static void main(String[] args) {
		Interf4.m5();
		StaticMethod s=new StaticMethod();
		//s.m5;//cannot call from object reference static method here only we can call with interface name
	}

}
