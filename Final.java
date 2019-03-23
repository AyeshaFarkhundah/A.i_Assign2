package Problem;
import java.util.Scanner;
public class Final {
	
	
	
	
	public static void main(String [ ] args) {
		
				
		//Ask user if they would be computing using absolute or relative distance
		// Accept answer 
		System.out.println("How would you like to compute your process today? Type A for absolute value and Type R for relative");
		Scanner input = new Scanner(System.in);
		String compType = input.next();
		
		switch (compType) {
		
		case "A":
		
		//int cityMatrix[19][19];
		//creating a test city Matrix but can also accept these values from user
		
		//distance relative
		int testCityMatrix[][]={
				{0,172,145,607,329,72,312,120},
				{172,0,192,494,209,158,216,93},
				{145,192,0,490,237,75,205,100},
				{607,494,490,0,286,545,296,489},
				{329,209,237,286,0,421,49,208},
				{72,158,75,545,421,0,249,0,194},
				{120,92,100,489,208,75,194,0}		 
			};
		
		String cityName[]= {"Brighton", "Briston","Cambridge",
				            "Glasgow", "Liverpool", "London",
				            "Manchester", "Oxford"};
		
		//use relative distance to get absolute distance
		
		//City aCity = new City(cityName[0],0,0 );
		//City bCity = new City(cityName[1],0,0 );
		//City cCity = new City(cityName[2],0,0 );
		//City dCity = new City(cityName[3],0,0 );
		//City eCity = new City(cityName[4],0,0 );
		//City fCity = new City(cityName[5],0,0 );
		//City gCity = new City(cityName[6],0,0 );
		//City hCity = new City(cityName[7],0,0 );
	
		break;
		
		case "R":
		System.out.println("using relative methods");
		break;
		
		default:
			System.out.println("Inapproritate command");
	 
		} 
		//printing the result on console
		System.out.println("The route is:");
		 for(int i=0;i<8;i++){
			 System.out.println(" City:"+ MapList(i));
			 
		 }
		}
	}
	
	
	
	
	 
	 
	 
