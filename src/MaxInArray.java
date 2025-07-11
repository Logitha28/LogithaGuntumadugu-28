import java.util.*;
public class MaxInArray {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] arr={3,7,2,9,4,5};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    } 
}
