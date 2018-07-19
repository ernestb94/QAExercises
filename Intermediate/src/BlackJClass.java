
public class BlackJClass {
	public int blkjk(int card1, int card2) {
		if (card1 > 21 && 21 <= card2) {
			return card2;
		} else if (card1 < 21 && 21 >= card2) {
			return card1;
		} else {
			return 0;

		}
	}
}
