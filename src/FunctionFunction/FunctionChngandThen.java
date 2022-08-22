package FunctionFunction;

import java.util.function.Function;

public class FunctionChngandThen {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->2*i;
		Function<Integer,Integer> f1=i->i*i*i;
		System.out.println(f.andThen(f1).apply(2));//first f execute and then f1 execute
		
	}

}
