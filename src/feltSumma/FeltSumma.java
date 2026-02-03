package feltSumma;

import java.util.Scanner;

/**
 *
 * @author jarih
 */
public class FeltSumma {

    public static void main(String[] args) {
        int[] heltal = {12, 16, 78, 98, 2, 45, 65};
        Scanner input = new Scanner(System.in);

        System.out.print("Ange en mulipilkator: ");
        int mul = input.nextInt();
        multiplicera(heltal, mul);
        for (int i = 0; i < heltal.length; i++) {
            System.out.print(heltal[i] + " ");
        }
        System.out.println("");
    }

    private static void multiplicera(int[] heltal, int mul) {
        for (int i = 0; i < heltal.length; i++) {
            heltal[i] *= heltal[i];
        }
    }
}
