//Find the maximum & minimum number in an array of integers.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }

         int max = numbers[0];
         int min = numbers[0];
 
         for (int i = 1; i < size; i++) {
             if (numbers[i] > max) {
                 max = numbers[i];
             }
             if (numbers[i] < min) {
                 min = numbers[i];
             }
         }
 
         System.out.println("Maximum number: " + max);
         System.out.println("Minimum number: " + min);
 
         sc.close();
    }
}
