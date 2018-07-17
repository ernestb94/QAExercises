
public class Operate {
	public static int f (int a, int b, boolean bool) {
		int total;
		if (bool) {
			if (a ==0 ) {
				// total = a + b;
				// return total;
				return b;
			}
			if (b == 0) {
				return a;
			}
		} else {
			total = a * b;
			return total;
		}
		
		return 0;
	}

}
