
public class Temperature {
	public boolean tooHot(int temp, boolean isSummer) {
		if (isSummer) {
			if (temp > 100 || temp < 60) {
				return false;
			} else {
				return true;
			}
		} else {
			if (temp > 90 || 60 < temp) {
				return false;
			} else {
				return true;
			}
		}
	}
}
