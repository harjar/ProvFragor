package asterixtriangel;

import java.util.Scanner;

/**
 *
 * @author jarih
 */
public class AsterixTriangel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ange antalet rader trangeln ska ha: ");
        int rader = input.nextInt();

        System.out.println("");
        for (int i = 1; i <= rader; i++) {
            for (int j = 0; j < rader - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
