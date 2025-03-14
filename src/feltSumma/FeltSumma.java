/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feltSumma;

/**
 *
 * @author jarih
 */
public class FeltSumma {

    public static void main(String[] args) {
        int[] heltal = {12, 16, 78, 98, 2, 45, 65};
        int summa = 0;

        for (int i = 0; i < heltal.length; i++) {
            summa += heltal[i];
        }
        System.out.println("Summa = " + summa);
    }
}
