import java.util.Scanner;
public class largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 'a' : ");
        int a = sc.nextInt();

        System.out.print("Enter the number 'b' : ");
        int b = sc.nextInt();

        System.out.print("Enter the number 'c' : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is the biggest number.");
        }
        if(b>a && b>c){
            System.out.println(a + " is the biggest number.");
        }
        if(c>b && c>a){
            System.out.println(a + " is the biggest number.");
        }
    }
}
