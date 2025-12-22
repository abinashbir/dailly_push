import java.util.Scanner;

public class fun {
    public static void main(String[] args) {
        int added=addd();
        System.out.println(added);
    }
    static int addd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();;
        return num1 + num2;
    }
}
