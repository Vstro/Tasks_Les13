package by.htp.les13.entity;

public class District {
	private String title;
	private int area;
	
	public District() {
		this("Unknown", 6900);
	}
	
	public District(int area) {
		this("Unknown", area);
	}
	
	public District(String title, int area) {
		this.title = title;
		this.area = area;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
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
		District other = (District) obj;
		if (area != other.area)
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
		return "District [title=" + title + ", area=" + area + "]";
	}
}
