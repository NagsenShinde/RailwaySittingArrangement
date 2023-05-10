package RailwayProjectMulti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RailwayInformation {
	
	static List<String> getRailwayName()
	{
		List<String> TrainName = new ArrayList<>();
	       
		TrainName.add("Nandigram Express");
		TrainName.add("Amritsar Express");
		TrainName.add("Devgiri Express");
		TrainName.add("Delhi Express");
		TrainName.add("Raipur Express");
		TrainName.add("Hyderabad Experss");
		TrainName.add("Ranchi Express");
		TrainName.add("Marathwada Express");
		TrainName.add("Rajdhani Express");
		TrainName.add("Punjab Express");
		return TrainName;
	}
	public static String railwayNameInformation()
	{
		List<String> TrainName = getRailwayName();
		Random random= new Random();
        return TrainName.get(random.nextInt(TrainName.size()));
	}
	public static String getPersonRamdomName() {
	    Random random = new Random();
	    String randomPersonName="";
	    for (int i = 1; i <= 5; i++) {
	    	randomPersonName=randomPersonName+ (char)(97 + random.nextInt(26)); 
	    } 
	   return randomPersonName;
	}

}
