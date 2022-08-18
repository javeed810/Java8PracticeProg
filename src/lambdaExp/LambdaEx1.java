package lambdaExp;
@FunctionalInterface
interface Interf{
	void m1();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		Interf i=()->System.out.println("invoked by lambdaEx");
		i.m1();
	}
}
