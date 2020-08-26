package by.htp.les13.entity;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private int score;
	private final String client;
	private boolean active;
	
	public Account() {
		this.score = 0;
		this.client = "Anonymous";
		this.active = true;
	}
	
	public Account(String client) {
		this.score = 0;
		this.client = client;
		this.active = true;
	}
	
	public Account(int score, String client) {
		this.score = score;
		this.client = client;
		this.active = true;
	}

	public int getScore() {
		return score;
	}

	public void incScore(int increment) {
		this.score += increment;
	}
	
	public void decScore(int decrement) {
		this.score -= decrement;
	}

	public String getClient() {
		return client;
	}
	
	public boolean isActive() {
		return active;
	}

	public void block() {
		this.active = false;
	}
	
	public void unblock() {
		this.active = true;
	}

	@Override
	public String toString() {
		return "Account [score=" + score + ", client=" + client + ", active=" + active + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + score;
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
		Account other = (Account) obj;
		if (active != other.active)
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
}
