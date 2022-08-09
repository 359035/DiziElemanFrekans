/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizielemanfrekans;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class DiziElemanFrekans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Eleman Sayisini Giriniz:");
        int boyut = scan.nextInt();
        int[] liste = new int[boyut];
        int[] frekans = new int[boyut];

        for (int i = 0; i < boyut; i++) {

            System.out.print((i + 1) + ". Eleman:");
            liste[i] = scan.nextInt();

        }

        for (int i = 0; i < boyut; i++) {
            frekans[i] = 1;
        }

        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if ((i != j) && (liste[i] == liste[j])) {
                    liste[j] = 0;
                    frekans[i]++;
                }
            }
        }

        for (int i = 0; i < boyut; i++) {
            if (frekans[i] >= 1) {
                if (liste[i] != 0) {
                    System.out.println(liste[i] + " Sayisi " + frekans[i] + " Kere Tekrar Ediyor.");
                }
            }
        }

    }

}
