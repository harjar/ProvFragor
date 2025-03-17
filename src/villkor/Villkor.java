package villkor;

import java.util.Scanner;

/**
 *
 * @author jarih
 */
public class Villkor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        int tal = input.nextInt();

        if (tal > 15 && tal < 65) {
            System.out.println("sant");
        } else {
            System.out.println("falskt");
        }
    }

}
