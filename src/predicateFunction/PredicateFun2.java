package predicateFunction;

import java.util.function.Predicate;

public class PredicateFun2 {
	public static void main(String[] args) {
		String[] s3= {"venkat","nagarjuna","salmankhan","balu","alluarjun"};
		Predicate<String> p1=s->s.length()%2==0;
		for(String s1:s3) {
			if(p1.test(s1)){
				System.out.println(s1);
			}
		}
		
	}

}
