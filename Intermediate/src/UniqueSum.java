
public class UniqueSum {
	public int operateThree(int n1, int n2, int n3) {
		if (n1 == n2 && n2 == n3) {
			return 0;
		}

		else if (n1 != n2 && n2 == n3) {
			return n1;
		} else if (n1 == n2 && n2 != n3) {
			return n3;
		} else if (n1 == n3 && n3 != n2) {
			return n2;
		} else if (n1 != n2 && n2 != n3) {
			return n1 + n2 + n3;
		} else {
			System.out.println("Need Value");
			return 0;
		}
	}

}
