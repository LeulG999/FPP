package lesson4;
public class RecursionMaxValue {
    public  int maxValue(int[]arr, int i){
       if(i==arr.length-1){
           return arr[i];
       }
       int maxOfSub=maxValue(arr,i+1);
        return Math.max(arr[i], maxOfSub);
    }
    public static void main(String[] args){
        int[]arr={5, -3, 6, 1, 9, 4};
        RecursionMaxValue obj=new RecursionMaxValue();
        System.out.println("The Maximum value = "+ obj.maxValue(arr,0));
    }
}
