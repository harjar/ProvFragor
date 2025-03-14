/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
