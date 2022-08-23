package MethodAndConstructorReference;
class Sample{
	Sample(){
		System.out.println("Sample class Constructor");
	}
}
interface Interf5{
	public Sample get();
}

public class ConstructorRef {
	public static void main(String[] args) {
		Interf5 i=Sample::new;
		i.get();
	}

}
