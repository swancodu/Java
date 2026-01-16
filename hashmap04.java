//check if two strings are anagrams

import java.util.HashMap;
public class hashmap04 {
    public static void main(String[]args){
        String s1 = "listen";
        String s2 = " silent";

        //if lengths differ they cannot be anagrams
        if(s1.length() != s2.length()){
            System.out.println("not anagrams");
            return;
        }

        //create hashmap
        HashMap<Character , Integer>map = new HashMap<>();

        //count characters in first string
        for( char ch : s1.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0) + 1);
        }

        //decrease count using second string
        for(char ch : s2.toCharArray()){
            if( !map.containsKey(ch)){
                System.out.println("not anagrams");
                return;
            }
            map.put(ch , map.get(ch) - 1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        //if map is empty 
        if (map.isEmpty()) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    
}
