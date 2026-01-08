import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        System.out.println("We will perform binary search :)");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + "th element:");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();

        int result = binary_search(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
