package funGame;

public class RandomGame {
	

	public int generateNumber() {

		int number = (int) (Math.random() * 100 + 1);	
		return number;

	}
	
	public boolean guessNumber(int guess, int rand ) {
	    if(guess == rand) {
	    	return true;
	    }
	    else if(guess < rand) {
	    	System.out.println("Too Low!");
	    	return false;
	    }else {
	    	System.out.println("Too goddamn high!");
	    	return false;
	    }
	    
	}
}
