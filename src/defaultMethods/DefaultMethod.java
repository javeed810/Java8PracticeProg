package defaultMethods;

interface Interf3{
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("Default method");
	}
}
public class DefaultMethod implements Interf3{
	public void m1() {
		System.out.println("m1 method overriden");
	}
	public void m2() {
		System.out.println("m2 method overriden");
	}
	public static void main(String[] args) {
		DefaultMethod d=new DefaultMethod();
		d.m3();
		d.m1();
		d.m2();
	}
}
