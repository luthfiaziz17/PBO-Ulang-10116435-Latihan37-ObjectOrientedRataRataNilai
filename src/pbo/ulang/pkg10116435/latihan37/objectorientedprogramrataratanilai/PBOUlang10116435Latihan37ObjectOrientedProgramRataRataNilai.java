/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.latihan37.objectorientedprogramrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Luthfi
 */
public class PBOUlang10116435Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   RataNilai mhs = new RataNilai();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mhs.HitungTotal(mhs.nilaiMhs, n);
         mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
        System.out.println("Developed by : Rinanda Al Qorrie A");
    }
    
}
