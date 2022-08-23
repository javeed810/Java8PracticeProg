package MethodAndConstructorReference;

public class RunnableUsingMethodRefStatic {
	public static void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread-2");
		}
	}
	public static void main(String[] args) {
		Runnable r=RunnableUsingMethodRefStatic::m1;//for static method class-name::method-name
		//Runnable r=Object-name::method-name;//for non static method
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread-2");
		}
	}
}
