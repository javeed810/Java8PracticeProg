package lambdaExp;

@FunctionalInterface
interface Interf2{
	public int add(int a,int b);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		Interf2 ii=(a,b)->a+b;
		System.out.println(ii.add(2, 2));
		System.out.println(ii.add(2, 3));
	}

}
