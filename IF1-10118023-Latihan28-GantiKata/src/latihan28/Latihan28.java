/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan28;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Ganti Kata
 */

public class Latihan28 {

    public static void main(String[] args) {
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String kataBaru;

        Scanner input = new Scanner(System.in);
        
        System.out.println("=====PROGRAM MENGGANTI KATA=====");
        System.out.print("Masukkan Kalimat\t: ");
        kalimatAwal = input.nextLine();
        
        System.out.print("Ganti Kata\t\t: ");
        gantiKata =  input.nextLine();
        
        System.out.print("Menjadi Kata\t\t: ");
        kataBaru = input.nextLine();
        System.out.println("");

        kalimatBaru = kalimatAwal.replaceAll(gantiKata,kataBaru);
        System.out.println("========HASIL FORMATTING========");
        System.out.println("Kalimat awal  : " + kalimatAwal);
        System.out.println("Kalimat baru  : " + kalimatBaru);
    }
    
}
