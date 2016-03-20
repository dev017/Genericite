import java.util.Date;

public class App2 {

	public static void main(String[] args) {
		Triplet<String, Double> o1 = new Triplet<String, Double>("A", "B", 7.3);
		System.out.println(o1.getA() + " - " + o1.getB() + " - " + o1.getC());

		Triplet<Date, Float> o2 = new Triplet<Date, Float>(new Date(), new Date(), 7f);
		System.out.println(o2.getA() + " - " + o2.getB() + " - " + o2.getC());
	}
}
