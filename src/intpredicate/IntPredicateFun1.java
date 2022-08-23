package intpredicate;

import java.util.function.IntPredicate;

public class IntPredicateFun1 {
	public static void main(String[] args) {
		IntPredicate ip=i->i%2==0;
		int x[]= {0,5,10,15,20,25};
		for(int x1:x) {
			if(ip.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
