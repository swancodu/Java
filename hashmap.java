//hashmap problem number 1 --- frequency count 
//int[]arr = { 1 , 2 , 2 , 3 , 1, 4 ,2}

import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String[]args){
        int[]arr =  { 1 , 2 , 2 , 3 , 1, 4 ,2};

        //creating hashmap
        HashMap<Integer , Integer>map = new HashMap<>();

        //count frequency
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " --->" + entry.getValue());
        }
    }
    
}
