package supplerFun;
import java.util.function.*;
import java.util.Date;

public class SupplierFun1 {
	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
	}

}
