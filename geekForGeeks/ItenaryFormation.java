package geekForGeeks;

import java.util.HashMap;
import java.util.Map;

public class ItenaryFormation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> dataSet = new HashMap<String, String>();
	        dataSet.put("Chennai", "Banglore");
	        dataSet.put("Bombay", "Delhi");
	        dataSet.put("Goa", "Chennai");
	        dataSet.put("Delhi", "Goa");
	        ItenaryFormation iF= new ItenaryFormation();
	        iF.itenary(dataSet);
	}

	public void itenary(HashMap<String, String> locations){
		String startLocation="";
		HashMap<String, String> reverse= new HashMap<String, String>();
		for(Map.Entry<String, String> entry: locations.entrySet()){
			reverse.put(entry.getValue(), entry.getKey());
		}
		for(Map.Entry<String, String> entry: locations.entrySet()){
			if(!reverse.containsKey(entry.getKey())){
				startLocation= entry.getKey();
				break;
			}
		}
		String itenary= locations.get(startLocation);
		while(itenary != null){
			System.out.println(startLocation +"->"+ itenary);
			startLocation= itenary;
			itenary= locations.get(startLocation);
		}
	}
}
