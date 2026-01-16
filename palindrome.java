public class palindrome{
    public static void main(String[]args){
        int arr[] = {2 , 3 , 4 , 3 , 2 };
        int left = 0;
        int right = arr.length - 1;
        boolean ispalindrome = true;

        while(left<right){
            if(arr[left] != arr[right]){
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        
        }
        System.out.println(ispalindrome);
    }
}

