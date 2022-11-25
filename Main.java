/**
 *
 * @author Amdzak
 */

package com.main.menghitungsisimiringsefgitiga;

import java.util.Scanner;

public class MenghitungSisiMiringSefgitiga {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SCANNER
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        double tinggi,alas,miring,hasil;
        
        //INPUT USER
        System.out.println("=== program segitiga siku siku ===\n");
        System.out.print("Masukan Alas Segitiga : ");
        alas = input.nextDouble();
        System.out.print("Masukan Tinggi Segitiga : ");
        tinggi = input.nextDouble();
        
        //PRNCARIAN SISI MIRING
        hasil = (alas*alas)+(tinggi*tinggi);
        miring = Math.sqrt(hasil);
        
        //OUTPUT SISI MIRING
        System.out.println("Sisi miring = " + miring);
    }
}
