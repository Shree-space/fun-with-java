package assignment5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	Map<String, Integer> hm1 = storeFreqOnMap(a.toLowerCase());
    	Map<String, Integer> hm2 = storeFreqOnMap(b.toLowerCase());
        Set <Map.Entry<String, Integer>> entrySet = hm1.entrySet();
    	boolean anagram = false;
    	if (hm1.size()==hm2.size()) {
    	for (Map.Entry<String, Integer> entry:entrySet){
     		String k = entry.getKey();
    		int val1 = entry.getValue();
    		//System.out.println(k+val1);
    		if(hm2.containsKey(k)) {
    			int val2 = hm2.get(k);
    			//System.out.println(k+val2);
    			if (val1==val2) {
    				anagram = true;
    			}else {
    				anagram = false;
    				break;
    			}
    				
    		}else {
    			anagram  = false;
    			break;
    		}
    		  
    	}
    	
    	}
    	 return anagram;
        
    	
    
        	
      }
           	
    
   static Map<String, Integer> storeFreqOnMap(String a) {
    	Map<String,Integer> hm = new HashMap<String, Integer>();
    	for (int i=0; i < a.length(); i++) {
    	int ctr = 0;
     	String x = a.substring(i,i+1);
    	if (!hm.containsKey(x)) {
    		hm.put(x, ctr);
    		for (int j = i; j <a.length();j++) {
           		String y = a.substring(j,j+1);
           		if(x.equalsIgnoreCase(y)) {
           			ctr++;
           		}
           		
           	}
    		hm.replace(x, ctr);
    	}
     }
		return hm;

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}