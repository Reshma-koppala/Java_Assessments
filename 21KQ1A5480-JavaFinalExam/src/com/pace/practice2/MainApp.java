package com.pace.practice2;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City ongole=new City("ongole","bulls",50000,"AP");
		City guntur=new City("guntur","LionSafari",60000,"AP");
		City mangalgire=new City("mangalgire","sarees",70000,"AP");
		ArrayList<City> cityList=new ArrayList<City>();
		cityList.add(ongole);
		cityList.add(guntur);
		cityList.add(mangalgire);

		for(City city:cityList) {
			String Name=city.name;
			String famous=city.famousFor;
			if(Name.charAt(0)=='m' && Name.charAt(Name.length()-1)=='e') {
				System.out.println(Name);
			}
			if(famous.equals("LionSafari")){
				System.out.println(Name);
			}
			
		}
	}

}
