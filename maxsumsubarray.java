//sliding window technique

public class maxsumsubarray {
    public static int maxsumsubarray(int[] arr , int k){
      int windowSum = 0;
      int maxSum = 0;
      int start = 0;

      for(int end =0 ; end<arr.length ; end++){
        //add current element 
        windowSum += arr[end];

        //when window size becomes k 
        if(end - start + 1 == k){
            //update maximum
            maxSum = Math.max(maxSum , windowSum);

            //slide window
            windowSum -= arr[start];
            start++;
        }
      }
      return maxSum;
    }
    public static void main(String[] args){
        int[] arr = {2 , 1 , 5, 1 , 3, 2};
        int k = 3;
        System.out.println(maxsumsubarray(arr , k));
    }
}
