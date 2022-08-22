package ConsumerFun;
import java.util.function.*;

class Movie{
	String name;
	public Movie(String name) {
		this.name=name;
	}
}
public class ConsumerChaining {
	public static void main(String[] args) {
		Consumer<Movie> c1=m->System.out.println(m.name+"Ready to release");
		Consumer<Movie> c2=m->System.out.println(m.name+"is flopped");
		Consumer<Movie> c3=m->System.out.println(m.name+"is got loss");
		Movie m=new Movie("Spider");
		c1.andThen(c2).andThen(c3).accept(m);
	}

}
