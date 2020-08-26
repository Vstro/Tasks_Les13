package by.htp.les13.entity;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String title;
	private List<Region> regions;
	private City capital;
	
	public Country(String title) {
		this.title = title;
		
		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < 5; i++) {
			regions.add(new Region());
		}
		this.regions = regions;
		
		this.capital = new City();
	}
	
	public Country(String title, List<String> regionsNames, String capitalName) {
		this.title = title;
		
		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < regionsNames.size(); i++) {
			regions.add(new Region(regionsNames.get(i), regionsNames.get(i)));
		}
		this.regions = regions;
		
		this.capital = new City(capitalName);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		Country other = (Country) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
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
		return "Country [title=" + title + ", regions=" + regions + ", capital=" + capital + "]";
	}
}
