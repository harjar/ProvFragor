/*
    Vilken typ av fel ser du i programmet nedan?
    Hur löser du felet, ange vad och vilken/vilka rader du behöver skriva om för att programmet ska ge korrekt resultat.
 */
package summaMedel;

import java.util.Scanner;

public class SummaMedel {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] heltal = new int[6];
        int tal;
        int antal = 0;
        int summa = 0;
        double medel;
        do {
            System.out.print("Ange ett heltal: ");
            tal = input.nextInt();
            if (tal > 0) {
                heltal[antal++] = tal;
            } else {
                break;
            }

        } while (tal > 0 && antal < heltal.length);

        for (int i = 0; i < heltal.length; i++) {
            summa += heltal[i];
        }

        medel = summa / (double) heltal.length;
        System.out.println("Summa: " + summa);
        System.out.println("Medel: " + medel);
    }
}
