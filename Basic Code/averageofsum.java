//sliding window technique
public class averageofsum {
    public static double[] averageofsum(int[]arr , int k){
        double[] result = new double[arr.length - k + 1];
        int start = 0;
        double windowSum = 0;

        for(int end = 0 ; end<arr.length ; end++){
            //add current element 
            windowSum += arr[end];

            //when window size becomes k 
            if(end - start + 1 ==  k){
                //calculate average
                result[start] = windowSum/k;
                    windowSum -= arr[start];
                    start++;  
            }
        }
        return result;
    }
    public static void main(String []args){
        int[] arr = {1 , 3 , 2 ,6 ,-1 , 4 , 1 , 8 , 2};
        int k = 5;
        double [] averages = averageofsum(arr , k);
        for(double avg : averages){
            System.out.println(avg + " ");
        }
    }
    }

