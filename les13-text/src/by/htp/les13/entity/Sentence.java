package by.htp.les13.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
	private List<Word> words;
	
	public Sentence(List<String> words) {
		this.words = new ArrayList<Word>();
		
		for (int i = 0; i < words.size(); i++) {
			this.words.add(new Word(words.get(i)));
		}
	}
	
	public Sentence(String sentence) {
		this(Arrays.asList(sentence.split(" ")));
	}
	
	public List<Word> getWords() {
		return words;
	}
	
	public String getSentence() {
		StringBuilder sentence = new StringBuilder();
		
		for (int i = 0; i < words.size(); i++) {
			sentence.append(words.get(i).getWord());
			if (i != words.size() - 1) {
				sentence.append(" ");
			}
		}
		
		return sentence.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [words=" + words + "]";
	}
}
