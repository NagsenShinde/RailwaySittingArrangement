package RailwayProjectMulti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		 
		RailwayInformation railwayInformation=new RailwayInformation();
		Person persons=new Person(); 
        for(int i=1;i<=70;i++)
        {
        	Thread thread=new Thread(persons,railwayInformation.getPersonRamdomName()+"-" +i);
        	thread.start();
        	try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}       	
        }
        List<String> RailwayNameInformation =RailwayInformation.getRailwayName();
        System.out.println("Total Railways present on platform:-" +RailwayNameInformation);
        
        Map<String,Integer> entry= persons.map;
        
    //    System.out.println(entry);
        for(String person : RailwayNameInformation) {
			if(!entry.containsKey(person)) {
				entry.put(person,0);
				
			}
		}
        
        List<Entry<String,Integer>> listOfPersonEntry = new ArrayList<>(entry.entrySet());
		
        listOfPersonEntry.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        int count=0;
		 for(int i=0;i<listOfPersonEntry.size();i++)
		 {
			 count=count+1;
		 }
		 System.out.println("Total number of train avilable on platform:-"+ count);
		
		for(Entry<String,Integer> personEntity : listOfPersonEntry) { 
			System.out.println(personEntity.getKey() + ":-" + personEntity.getValue());
		}
		 
	}
}
