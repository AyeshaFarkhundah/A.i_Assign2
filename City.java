package Problem;

public class City {
	
	String name;
	int x,y;
	
	
	public City (String name, int x, int y) {
		this.name= name;
		this.x=x;
		this.y=y;
	}

	public String getName() {
		return this.name;
	}
	public int getx() {
		return this.x;
	}
	
	public int gety() {
		return this.y;
	}
	
	public double distance (City nextC) {
		int xVal=getx()-nextC.getx();
		int yVal=gety()-nextC.gety();
		double answer=Math.sqrt((xVal*xVal)+(yVal*yVal));
		return answer;
		
	}
}

