//1. Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Names array: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter names: ");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }

    }
}
