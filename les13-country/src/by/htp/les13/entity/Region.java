package by.htp.les13.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String title;
	private List<District> districts;
	private List<City> cities;
	private City centralCity;

	public Region() {
		this.title = "Unknown";
		
		List<District> districts = new ArrayList<District>();
		for (int i = 0; i < 5; i++) {
			districts.add(new District());
		}
		this.districts = districts;
		
		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < 5; i++) {
			cities.add(new City());
		}
		this.cities = cities;
		
		this.centralCity = new City();
	}
	
	public Region(String title, String centralCityName) {
		this.title = title;
		
		List<District> districts = new ArrayList<District>();
		for (int i = 0; i < 5; i++) {
			districts.add(new District());
		}
		this.districts = districts;
		
		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < 5; i++) {
			cities.add(new City());
		}
		this.cities = cities;
		
		this.centralCity = new City(centralCityName);
	}
	
	public Region(String title, List<Integer> districtAreas, List<String> cityNames, String centralCityName) {
		this.title = title;
		
		List<District> districts = new ArrayList<District>();
		for (int i = 0; i < districtAreas.size(); i++) {
			districts.add(new District(districtAreas.get(i)));
		}
		this.districts = districts;
		
		List<City> cities = new ArrayList<City>();
		for (int i = 0; i < cityNames.size(); i++) {
			cities.add(new City(cityNames.get(i)));
		}
		this.cities = cities;
		
		this.centralCity = new City(centralCityName);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City getCentralCity() {
		return centralCity;
	}

	public void setCentralCity(City centralCity) {
		this.centralCity = centralCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centralCity == null) ? 0 : centralCity.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
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
		Region other = (Region) obj;
		if (centralCity == null) {
			if (other.centralCity != null)
				return false;
		} else if (!centralCity.equals(other.centralCity))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
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
		return "Region [title=" + title + ", districts=" + districts + ", cities=" + cities + ", centralCity="
				+ centralCity + "]";
	}
	
}
