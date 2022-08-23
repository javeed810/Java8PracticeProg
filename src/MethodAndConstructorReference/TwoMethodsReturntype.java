package MethodAndConstructorReference;

interface Interff{
	public void add(int a,int b);
}

public class TwoMethodsReturntype {
	public static void sum(int x,int y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Interff i=(a,b)->System.out.println(a+b);
		i.add(20, 10);
		Interff i1=TwoMethodsReturntype::sum;
		i1.add(200, 300);
	}
}
