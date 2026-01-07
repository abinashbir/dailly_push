
import java.util.Scanner;

public class aarraylrarn {
    public static void main(String[] args) {
      
        int[] students = new int[10];
        int size = students.length;
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<size;i++){            
            System.out.print("Enter the number : ");
            students[i]=sc.nextInt();
        }

        for(int i = 0;i<size;i++){
            System.out.println(students[i]);
        }
        sc.close();
    }
    
}
