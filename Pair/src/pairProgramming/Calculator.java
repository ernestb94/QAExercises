package pairProgramming;

public class Calculator {

	public String calculate(int ... args) {
		String result = "";
		int[] array = args;
		int found = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array.length; k++) {
					if (i == j || j == k || i == k) {
						continue;
					}
					if (array[i] + array[j] == array[k]) {
						if (found > 0)
							result += ", ";
						result += "" + array[i] + " + " + array[j] + " = " + array[k];
						found++;
					}
					if (array[i] - array[j] == array[k]) {
						if (found > 0)
							result += ", ";
						result += "" + array[i] + " - " + array[j] + " = " + array[k];
						found++;
					}
					if (array[i] * array[j] == array[k]) {
						if (found > 0)
							result += ", ";
						result += "" + array[i] + " * " + array[j] + " = " + array[k];
						found++;
					}
					if (array[i] / array[j] == array[k]) {
						if (found > 0)
							result += ", ";
						result += "" + array[i] + " / " + array[j] + " = " + array[k];
						found++;
					}
				}
			}
		}
		return result;
	}

}
