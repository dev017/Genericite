import java.util.Date;

public class App {

	public static void main(String[] args) {

		Couple<Integer> c1 = new Couple<Integer>(3, 5);

		Couple<Date> c2 = new Couple<Date>(new Date(), new Date());

		System.out.println(c1.getA());
		System.out.println(c2.getA());
	}
}
