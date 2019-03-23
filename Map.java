package Problem;

import java.util.ArrayList;
import java.util.Collections;


public class Map {
	
	//for 20 cities:
    //public ArrayList Mapp= new ArrayList<City>(20);
	
	//for test of 8 cities
	public ArrayList MapList= new ArrayList<City>(7);
	int index=0;
	double fitness=0;
	double distance=0;
	int NumCity=0;
	
	
	public Map(ArrayList MapList) {
		this.MapList=MapList;
	}
	
	public void setCity(City placeCity,int i) {
	MapList.set(i, placeCity);
	fitness=0;
	distance=0;
	}
	
	public City getCity(int i) {
		return (City)MapList.get(i);
	}
	
	public void setFitness(double fitness) {
		this.fitness=fitness;
	}
	
	public double getFitness(int i) {
            if(fitness==0) {
            	fitness= 1/TotalDist();
            }
            return fitness;
	}
	
	public void setNumCity() {
		this.NumCity=MapList.size();
	}
	public double TotalDist() {
		double total =0;
		if (distance==0) {
			//for tet 8 cities
			for (int j=0; j<6;j++) {
				City placeCity=getCity(j);
				City toCity= getCity(j+1);
				total = total+placeCity.distance(toCity);			
			}
			//for 20 cities
			//for (int i; i<20;i++) {	}
		
		} 
		
		return total; 
	}
	
	// initializing and creating new map order
	public void initaOrder() {
		for (int i=0;i<7;i++) { 
			setCity(MapRoute.getCity(i),i);
		}   
		 
		Collections.shuffle(MapList);
	}  
	
	public void mutate() {
		//creates random mutation in order by swapping 2 cities
		int numOrder=7;
		
			
	}
	
	public void cost() {
		double cost = 0;
				cost=cost+TotalDist();
	}
	
	
	public boolean cityOverlap(City placeCity) {
		boolean result=false;
		if (MapList.contains(placeCity)) {
			result=true;
		}
		return result;
	}
}
