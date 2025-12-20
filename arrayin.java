
import java.util.Scanner;

public class arrayin{
    public static void main(String[] args) {
        // lets do the if else question

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");

        int age = sc.nextInt();

        if (age>=18) {

            System.out.println("You are old enough to cast vote!! ");

        } else{
            System.out.println("Go back to school");
        }
    }
}
