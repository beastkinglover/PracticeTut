import java.util.*;

public class Annaa {      
      static boolean isAnagram(String a, String b) {
        if ((a == null || b == null) || (a.length() != b.length())) {
            return false;
        }
        String c = a.toLowerCase(); 
        String d = b.toLowerCase();   
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();  
        for(int i=0;i<c.length();i++){
             	if(map.containsKey( c.charAt(i) ) ){
                    int count = map.get(c.charAt(i));
                        count++; 
                    map.put((Character)c.charAt(i),count); 
                } else {
                    map.put(c.charAt(i),1); 
                }
        }
        HashMap<Character,Integer> map1 = new HashMap<Character, Integer>();   
        for(int i=0;i<d.length();i++){
             	if(map1.containsKey( d.charAt(i) ) ){
                    int count = map1.get(d.charAt(i));
                        count++; 
                    map1.put(d.charAt(i),count); 
                } else {
                    map1.put(d.charAt(i),1); 
                }
        }
        return isSame(map, map1);
    }

    public static boolean isSame(HashMap<Character,Integer> map, HashMap<Character,Integer> map1) {
        
                  for(Map.Entry<Character, Integer> entry: map.entrySet()) {
                      char key = entry.getKey();
                      int value1 = map.get(key);
                      int value2 = map1.get(key); 
                      if(value1 == value2){
                          continue; 
                      }
                      else{
                          return false; 
                      }
                  }
        return true; 
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
