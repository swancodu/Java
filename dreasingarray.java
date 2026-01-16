// 3rd que of next greater element

import java.util.Stack;

public class dreasingarray{
    public static int[] nextgreater(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        //traverse from right to left
        for( int i = n-1 ; i>=0 ; i--){

            //remove smaller
            while( !st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ?  -1 : st.peek();
            st.push(arr[i]);
        }
        return ans ;
    }
    public static void main(String [] args){{
        int[] arr = { 8 , 6 , 4, 2};
        int[] result = nextgreater(arr);

        System.out.println("next greater element:");
        for(int x : result){
            System.out.println( x + " ");
        }
    }}
}

