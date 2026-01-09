package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt(); 
        
        
        int[] arr = new int[size]; 
        int sum = 0;
        
        System.out.println("Enter " + size + " elements:");
        
       
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];   
        }
        
        System.out.println("Addition: " + sum);
    }
}