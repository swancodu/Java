//two sum 
//nums = { 2 , 7 , 11 , 15} ----- target = 9

import java.util.HashMap;
public class hashmap03 {
    public static void main(String[]args){
        int[]nums ={ 2 , 7 , 11 , 15};
        int target = 9;

        //crete hashmap to store number 
        HashMap<Integer , Integer>map = new HashMap<>();

        //traverse array 
        for(int i = 0 ;i<nums.length ; i++){
            int complement = target - nums[i];

            //check if complement exists
            if(map.containsKey(complement)){
                System.out.println( "indices:" + map.get(complement) + " ," + i);
                return ;
            }

            //store current number with index 
            map.put(nums[i] , i);
        }
        System.out.println("no solution found");
        
    }
}
