package by.htp.les13.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.les13.entity.Country;
import by.htp.les13.view.CountryViewver;

public class Main {

	public static void main(String[] args) {
		List<String> regionsNames = new ArrayList<String>();
		regionsNames.add("Minsk");
		regionsNames.add("Hrodno");
		regionsNames.add("Brest");
		regionsNames.add("Vitebsk");
		regionsNames.add("Mogilev");
		regionsNames.add("Homel");
		
		Country country = new Country("Belarus", regionsNames, "Minsk");
		CountryViewver view = new CountryViewver();
		
		view.printInfo(country);
	}

}
