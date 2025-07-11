import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] arr={1,4,6,7,9};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even:"+evencount);
        System.out.println("Odd:"+oddcount);

    }
    
}
