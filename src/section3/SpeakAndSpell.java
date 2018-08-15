package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("pneumonoultramicroscopicsilicovolcanoconiosis");
		// 2. Catch the user's answer in a String
String answer= JOptionPane.showInputDialog("spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis")) {
	speak("correct");
}
		// 4. Otherwise say "wrong"
else {
	speak("wrong");
}

		// 5. repeat the process for other words
speak("respiratory");
// 2. Catch the user's answer in a String
String response= JOptionPane.showInputDialog("spell the word");
// 3. If the user spelled the word correctly, speak "correct"
if(response.equalsIgnoreCase("respiratory")) {
speak("correct");
}
// 4. Otherwise say "wrong"
else {
speak("wrong");
}
speak("hi");
// 2. Catch the user's answer in a String
String memes= JOptionPane.showInputDialog("spell the word");
// 3. If the user spelled the word correctly, speak "correct"
if(memes.equalsIgnoreCase("hi")) {
speak("correct");
}
// 4. Otherwise say "wrong"
else {
speak("wrong");
}

		
	}
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


