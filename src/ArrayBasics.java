import java.util.*;
public class ArrayBasics {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();
        int add=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];

        System.out.print("Sum:"+ add);

    }
}