package RailwayProjectMulti;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Person implements Runnable {
    static int serialNumber=1;
    static long startTime=System.currentTimeMillis();
    RailwayInformation railwayInformation=new RailwayInformation();
	@Override
	public void run() {
		double timeTaken=System.currentTimeMillis()-startTime; 
		double personEntryTime=LocalDateTime.now().getHour()+timeTaken/1000; 
		String railwayName=RailwayInformation.railwayNameInformation();
		getPerson(railwayName);
		System.out.println(serialNumber++ +" "+Thread.currentThread().getName()+" "+personEntryTime+" "+railwayName);
		}
	static Map<String,Integer> map=new HashMap<>();
	public Map<String,Integer> getPerson(String person)
	{
		if(map.containsKey(person))
		{
			int count=map.get(person);
			map.put(person,count+1);
		}
		else
		{
			map.put(person,1);
		}
		return map;
		
	}
	 
	}
   


    /*public void run() {
		double timeTaken=System.currentTimeMillis()-startTime; 
		double personEntryTime=LocalDateTime.now().getHour()+timeTaken/1000; 
		System.out.println(serialNumber++ +" "+Thread.currentThread().getName()+" "+personEntryTime+" "+railwayInformation.RailwayNameInformation());
		}
		 
	}*/


