package Problem;

import java.util.ArrayList;

public class Population {

	Map[] AllMaps;
	
	public Map getMaps(int position) {
		return AllMaps[position];
	}
	
	public void setMaps() {
		
	}
		
	public void AllPaths (int i, Map placemap) {
		AllMaps[i]=placemap; 
	}
	
	public void newPaths( boolean i) {
		AllMaps = new Map[7];
		if ( i == true) {
			for (int j=0; j<8;j++) {
				Map anotherMap = new Map();
				anotherMap.initaOrder() ;
				AllPaths(j,anotherMap);
				
				 
			}
		}
	}
	
        
    
}

