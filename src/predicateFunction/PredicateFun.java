package predicateFunction;

import java.util.function.Predicate;

public class PredicateFun {
	public static void main(String[] args) {
		String[] s1= {"venkat","nagarjuna","salmankhan","balu","alluarjun"};
		
		Predicate<String> p=s->s.length()>5;
		//for(int i=0;i<s2.length;i++) {
		for(String s2:s1)
			if(p.test(s2)) {
				System.out.println(s2);
			}
		}
	}
