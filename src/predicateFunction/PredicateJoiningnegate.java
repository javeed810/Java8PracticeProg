package predicateFunction;

import java.util.function.Predicate;
public class PredicateJoiningnegate {
	public static void main(String[] args) {
		
	int x[]= {5,7,10,12,15,16,20};
	Predicate<Integer> p1=i->i%2==0;//for even numbers
	System.out.println("Numbers which are not even and >10 are: ");
	for(int x1:x) {
		if(p1.negate().test(x1)) {
			System.out.println(x1);
			}
		}
	}
}
