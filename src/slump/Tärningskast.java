/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slump;

import java.util.Scanner;

/**
 * Radnumreringen kommer inte att stämma med kodexemplet på provet, pga
 * kodkommentarer.
 *
 * Delfråga a) Programmet slumpar tärningskast, antalet kast bestäms av
 * användaren.
 *
 * Delfråga c) Skriver användaren ett nagativt tal eller noll körs inte loopen
 * och tärningskasten slumpas inte. Vilket innebär att vi har noll sexor vid
 * utskriften.
 *
 * @author jarih
 */
public class Tärningskast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ange antalet tärningskast: ");
        int antalKast = input.nextInt();

        int kast = (int) (Math.random() * 6) + 1;   // Slumpar ett tal mellan 0 och 0.99999
        int sexor = 0;
        int i = 0;
        while (i < antalKast) {
            if (kast == 6) {
                sexor++;
            }
            i++; // Delfråga b) Denna rad måste finnas annars har vi en loop som aldrig avslutas
            kast = (int) (Math.random() * 6) + 1;   // Slumpar ett tal mellan 0 och 0.99999
        }
        System.out.println("Antal sexor: " + sexor);
    }
}
