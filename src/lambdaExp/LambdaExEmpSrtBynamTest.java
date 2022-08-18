package lambdaExp;

import java.util.ArrayList;
import java.util.Collections;

class LambdaExEmpSrtBynam{
	int number;
	String name;
	public LambdaExEmpSrtBynam(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "LambdaExEmpSrtBynam [number=" + number + ", name=" + name + "]";
	}
	
}
public class LambdaExEmpSrtBynamTest {
	public static void main(String[] args) {
		ArrayList<LambdaExEmpSrtBynam> al=new ArrayList<LambdaExEmpSrtBynam>();
		al.add(new LambdaExEmpSrtBynam(1, "rahul"));
		al.add(new LambdaExEmpSrtBynam(4, "abdul"));
		al.add(new LambdaExEmpSrtBynam(2, "pavan"));
		al.add(new LambdaExEmpSrtBynam(3, "baba"));
		System.out.println(al);
		Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(al);
	}
}
