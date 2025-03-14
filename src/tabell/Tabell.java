/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabell;

/**
 *
 * @author jarih
 */
public class Tabell {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j += 2) {
                System.out.print("" + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
