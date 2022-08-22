package FunctionFunction;

import java.util.function.Function;

public class FunctionFun1 {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
	}

}
