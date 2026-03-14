package lesson4;
import java.util.Arrays;
public class RecursionReverseArray {
    public static void reverseArray(int[]arr,int left, int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(arr,left+1,right-1);
    }
    public static void main(String[] args){
        int[]arr={1, 3, 5, 7, 9, 13};
        reverseArray(arr,0, arr.length-1);
        System.out.println("Reversed Array is: "+Arrays.toString(arr) );
    }
}
