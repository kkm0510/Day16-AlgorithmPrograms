package main;

import java.util.ArrayList;
import java.util.Scanner;

public class YourNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listOfNumbersSoFar = new ArrayList<>();
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Think of a number between 0 to " + (n - 1));
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            listOfNumbersSoFar.add(mid);
            System.out.println("is " + mid + " your number? (1)Yes (2)No : ");
            if (sc.nextInt() == 1) {
                System.out.println("Your number found : " + mid);
                System.out.println("List : " + listOfNumbersSoFar);
                return;
            }
            System.out.println("Does your number lie in range : " + low + " - " + mid + " (1)Yes (2)No : ");
            if (sc.nextInt() == 1) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println("your number is not in range");
    }
}
