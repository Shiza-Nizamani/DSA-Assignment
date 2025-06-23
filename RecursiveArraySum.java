package DSAassignment;
import java.util.Scanner;
public class RecursiveArraySum {
    public static int recursiveSum(int[] array, int index) {
        // base case: if index is out of bound, return 0
        if (index == array.length) {
            return 0;
        }
        // recursive case: current element + sum of rest
        return array[index] + recursiveSum(array, index + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input array size
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] array = new int[size];
        System.out.println("Enter " + size + " element (seprated by space) : ");
        String[] input = sc.nextLine().trim().split("\\s+");
        if (input.length != size) {
            System.out.println("Error: expected " + size + "elements but got " + input.length);
            return;
        }
        // convert string input into integer array
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        //call the recursive function
        int sum = recursiveSum(array, 0);
        System.out.println("Sum of array elements: " + sum);
    }
}
