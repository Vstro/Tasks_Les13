package by.htp.les13.view;

import by.htp.les13.entity.Text;

public class TextViewver {
	public void printText(Text text) {
		System.out.println("------------------------------");
		System.out.println("\"" + text.getTitle().getSentence() + "\"");
		System.out.println("------------------------------");
		System.out.println(text.getText());
	}
}
