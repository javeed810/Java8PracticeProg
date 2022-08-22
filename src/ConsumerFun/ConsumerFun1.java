package ConsumerFun;
import java.util.function.*;
public class ConsumerFun1 {
	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Consumer Fun");
	}

}
