package Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        // square
        Scanner scanInput = new Scanner(System.in);
        Integer number = scanInput.nextInt();

        for (int i =0; i< number; i++) {
            for (int j =0 ; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
