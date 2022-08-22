package predicateFunction;

import java.util.function.Predicate;

public class PredicateJoiningand {
	public static void main(String[] args) {
		int x[]= {5,7,10,12,15,16,20};
		Predicate<Integer> p1=i->i%2==0;//for even numbers
		Predicate<Integer> p2=i->i>10;//for >10
		System.out.println("Numbers which are even and >10 are: ");
		for(int x1:x) {
			if(p1.and(p2).test(x1))
			{
				System.out.println(x1);
			}
		}
	}
}
