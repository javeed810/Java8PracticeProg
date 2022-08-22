package FunctionFunction;

import java.util.function.Function;

public class FunctionChngcompose {
	public static void main(String[] args) {
		Function<Integer,Integer> f2=i->2*i;
		Function<Integer,Integer> f3=i->i*i*i;
		System.out.println(f2.compose(f3).apply(2));//first f3 execute and then f2
		
	}

}
