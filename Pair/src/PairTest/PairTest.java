package PairTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pairProgramming.Translate;


public class PairTest {

	@Test
	
	public void testTxtMorse() {
		Translate t = new Translate();
		assertEquals("morse code dont match",".-", t.txtMorse("a"));
	}
	@Test
	public void testMorseTxt() {
		Translate t = new Translate();
		assertEquals("text dont match", "b", t.morseTxt("-..."));
		
	}
	
	@Test
	public void sentenceMorse() {
		Translate t = new Translate();
		assertEquals("Morse is not correct", "-- -.-- / -. .- -- . / .. ... / -- . .-.. ...- .. -. ", t.sentenceMorse("My name is Melvin"));
	}
}
