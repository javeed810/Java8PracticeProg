package lambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExCollctnCompartr {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(22);
		l.add(11);
		System.out.println(l);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
		Collections.sort(l,c);
		System.out.println(l);
	}

}
