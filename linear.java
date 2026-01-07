
import java.util.Scanner;


public class linear {
    public static void main(String[] args) {
        // int[] arr = new int[5];

        int[] larr = new int[5];
        int size = larr.length;
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<size;i++){
            System.out.print("Enter the element or the "+i+"th index : ");
            larr[i]=sc.nextInt();
        }

        System.out.print("Enter the element for linear search : ");
        int num = sc.nextInt();
        
        for(int i = 0;i<size;i++){
            if (larr[i]==num) {
                System.out.println("found at index "+ i);
            }
        }

    }
}