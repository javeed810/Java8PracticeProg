package lambdaExp;

import java.util.ArrayList;
import java.util.Collections;

class LambdaExEmployeeList{
	int num;
	String name;
	LambdaExEmployeeList(int num,String name){
		this.num=num;
		this.name=name;
	}
	@Override
	public String toString() {
		return "LambdaExEmployeeList [num=" + num + ", name=" + name + "]";
	}
	
}

public class LambdaExEmployeeListTest {
	public static void main(String[] args) {
		ArrayList<LambdaExEmployeeList> ar=new ArrayList<LambdaExEmployeeList>();
		ar.add(new LambdaExEmployeeList(10,"lalaman"));
		ar.add(new LambdaExEmployeeList(30,"pal"));
		ar.add(new LambdaExEmployeeList(20,"javeed"));
		System.out.println(ar);
		Collections.sort(ar,(e1,e2)->(e1.num<e2.num)?-1:(e1.num>e2.num)?+1:0);
		System.out.println(ar);
	}
	
}
