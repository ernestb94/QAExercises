package pairProgramming;

import java.io.File;
import java.util.HashMap;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Translate {

	public Translate() {
		listOfMorse();
	}

	private HashMap<Character, String> morsemap = new HashMap<>();

	private void listOfMorse() {
		morsemap.put('a', ".-");
		morsemap.put('b', "-...");
		morsemap.put('c', "-.-.");
		morsemap.put('d', "-..");
		morsemap.put('e', ".");
		morsemap.put('f', "..-.");
		morsemap.put('g', "--.");
		morsemap.put('h', "....");
		morsemap.put('i', "..");
		morsemap.put('j', ".---");
		morsemap.put('k', "-.-");
		morsemap.put('l', ".-..");
		morsemap.put('m', "--");
		morsemap.put('n', "-.");
		morsemap.put('o', "---");
		morsemap.put('p', ".--.");
		morsemap.put('q', "--.-");
		morsemap.put('r', ".-.");
		morsemap.put('s', "...");
		morsemap.put('t', "-");
		morsemap.put('u', "..-");
		morsemap.put('v', "...-");
		morsemap.put('w', ".--");
		morsemap.put('x', "-..-");
		morsemap.put('y', "-.--");
		morsemap.put('z', "--..");
	}

	public String morseTxt(String input) {
		for (Character values : morsemap.keySet()) {
			if (morsemap.get(values).equals(input)) {
				return String.valueOf(values);
			}

		}
		return null;

	}

	public String txtMorse(String input) {
		return morsemap.get(input.charAt(0));

	}

	public String sentenceMorse(String input) {
		String output = "";
		String space = "/ ";
		int inputlength = input.length();
		String[] eachChar = input.toLowerCase().split(" ");
		for (String value : eachChar) {
			for (int i = 0; i < value.length(); i++) {
				output += morsemap.get(value.charAt(i));
				output += " ";
			}
			if (eachChar[eachChar.length-1] == value) break;
				output += space;
		}
		return output;
	}
	public void beep(int noBeep) {
		
		try {
			File file = new File("C:\\Users\\Admin\\Desktop\\QAExercises-master\\Pair\\src\\Pair\\beep.wav");
			AudioInputStream sound = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(sound);
		}
        catch (Exception e)
        {
        e.printStackTrace();
        }
		
	}

}
