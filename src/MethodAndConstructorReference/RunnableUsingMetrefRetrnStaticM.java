package MethodAndConstructorReference;

public class RunnableUsingMetrefRetrnStaticM {
	public static int m2() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread-4");
		}
		return 10;
	};
	public static void main(String[] args) {
		Runnable r=RunnableUsingMetrefRetrnStaticM::m2;
		Thread t1=new Thread(r);
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread-4");
		}
	}

}
