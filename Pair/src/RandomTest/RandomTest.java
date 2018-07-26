package RandomTest;

import org.junit.Test;

import funGame.RandomGame;

public class RandomTest {

	@Test

	public void testRandomGame() {
		RandomGame rg = new RandomGame();
		assertEquals("Not working","12", rg.guessNumber("40", "40"));
	}
	
}
