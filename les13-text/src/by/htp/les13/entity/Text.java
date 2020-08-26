package by.htp.les13.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private Sentence title;
	private List<Sentence> sentences;
	
	public Text() {
		this.title = new Sentence("Unknown");
		this.sentences = new ArrayList<Sentence>();
	}
	
	public Text(String title) {
		this.title = new Sentence(title);
		this.sentences = new ArrayList<Sentence>();
	}
	
	public List<Sentence> getSentences() {
		return sentences;
	}
	
	public String getText() {
		StringBuilder text = new StringBuilder();
		
		for (int i = 0; i < sentences.size(); i++) {
			text.append(sentences.get(i).getSentence() + " ");
		}
		
		return text.toString();
	}
	
	public void addSentence(String sentence) {
		this.sentences.add(new Sentence(sentence));
	}
	
	public Sentence getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = new Sentence(title);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Text other = (Text) obj;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", sentences=" + sentences + "]";
	}
}
