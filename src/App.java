
public class App {

	public static void main(String[] args) {
		System.out.println("Math.PI -> "+ Math.PI);
		System.out.println("Leibniz PI -> " + calculateSequenceFor(300));
		/*
		 * Pass the number of fraction pairs
		 * for ex. -1/3 + 1/5 - 1/7 + 1/9 is considered as 2
		 */
	}
	
	public static double calculateSequenceFor(int n) {
		double sequenceVal = 0.0;
		
		int i = 0;
		while(i < n * 4) {
			sequenceVal += -1/(i+3.0) + 1/(i+5.0);
			i+=4;
		}
		
		return 4 * (1 + sequenceVal);
		
	}
}
