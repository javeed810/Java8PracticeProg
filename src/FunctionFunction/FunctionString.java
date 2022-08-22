package FunctionFunction;

import java.util.function.Function;

public class FunctionString {
	public static void main(String[] args) {
		Function<String,Integer> f=s->s.length();
		//Function<String,String> f=s->s.toUpperCase();
		System.out.println(f.apply("Javeed"));
		System.out.println(f.apply("ahmad"));
	}

}
