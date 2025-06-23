package DSAassignment;
import java.util.Scanner;
import java.util.Stack;
public class ReverseArrayUsingStack {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            // input array size
            System.out.println("Enter array size: ");
            int size = sc.nextInt();
            sc.nextLine();
            // declare and input array
            int[] array = new int[size];
            System.out.println("Enter "+size+" elements of array (seprated by space) :  ");
            String inputLine = sc.nextLine();
            String[] parts = inputLine.trim().split("\\s+");
            //validate input length
            if(parts.length != size){
                System.out.println("you enetered "+parts.length+" elements but expected "+size);
                return;
            }
            for(int i=0; i < size; i++){
                array[i] = sc.nextInt();
            }
            // create stack and push all elements
            Stack<Integer> stack = new Stack<>();
            for(int value : array){
                stack.push(value);
            }
            //pop element back into array
            for(int i = 0; i< size;i++){
                array[i]= stack.pop();
            }
            //output reversed array
            System.out.println("Reversed array: ");
            for(int value : array){
                System.out.println(value + " ");
            }
        }
    }

