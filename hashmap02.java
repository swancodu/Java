//first non repeating character
// aabbccd

import java.util.HashMap;

public class hashmap02 {
    public static void main(String[]args){
        String str = "aabbccd";

        //create hashmap to store character frequency
        HashMap<Character , Integer>map = new HashMap<>();

        //count freq of each character
        for( char ch : str.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0)+ 1);
        }
        //find frist character with freq 1
        for(char ch : str.toCharArray()){
       if(map.get(ch) == 1 ){
        System.out.println("first non repeating character:" + ch);
        return;
           } 
        }
        System.out.println("no");
    }
  
    
}
