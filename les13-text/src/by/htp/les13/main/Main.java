package by.htp.les13.main;

import by.htp.les13.entity.Text;
import by.htp.les13.view.TextViewver;

public class Main {

	public static void main(String[] args) {
		Text text = new Text();
		TextViewver view = new TextViewver();
		
		text.setTitle("Java");
		text.addSentence("Java is a class-based, object-oriented programming language.");
		text.addSentence("It is a general-purpose programming language intended to let application developers write once, run anywhere.");
		
		view.printText(text);
	}

}
