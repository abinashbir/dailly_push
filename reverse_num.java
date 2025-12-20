
import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuber and see the magic : ");
        int num = sc.nextInt();
        int renum = 0;
        while(num != 0){
            int lastdigit = num % 10;
            renum = renum * 10 + lastdigit;
            num = num / 10;
        }

        System.out.println(renum);
        
    }
}
