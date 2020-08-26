package by.htp.les13.view;

import by.htp.les13.entity.Country;

public class CountryViewver {
	public void printInfo(Country country) {
		System.out.println("The capital of the " + country.getTitle() + " is " + country.getCapital().getTitle());
		System.out.println(country.getTitle() + " has " + country.getRegions().size() + " regions");
		
		int totalArea = 0;
		for (int i = 0; i < country.getRegions().size(); i++) {
			for (int j = 0; j < country.getRegions().get(i).getDistricts().size(); j++) {
					totalArea += country.getRegions().get(i).getDistricts().get(j).getArea();
			}
		}
		
		System.out.println("Area of the " + country.getTitle() + " is " + totalArea);
		
		System.out.println("Central cities are:");
		for (int i = 0; i < country.getRegions().size(); i++) {
			System.out.println(country.getRegions().get(i).getCentralCity().getTitle());
		}
	}
}
