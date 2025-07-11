import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the integer N:");
        int N=scan.nextInt();
        int Square=N*N;
        int Cube=N*N*N;
        
        System.out.println("Square of " + N + " is: " + Square);
        System.out.println("Cube of " + N + " is: " +Cube );

    }
}
