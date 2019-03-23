package Problem;

import java.util.ArrayList;

public class MapRoute {

	public ArrayList cityList = new ArrayList<City>();
	public int size =20;
	
	public void setCity (City newCity) {
		//adds to the end
		cityList.add(newCity);
	}
	
	
	public City getCity(int i ) {
		return (City)cityList.get(i);
	}
	
}
