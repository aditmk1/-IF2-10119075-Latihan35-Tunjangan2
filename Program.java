/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan35;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : aditiya musthafa kamil
 * KELAS    : IF-2
 * NIM      : 10119075
 * Deskripsi Program : Program ini berisi program Tunjangan
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static Karyawan karyawanX;
    
    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        karyawanX.gajiPokok(scanner.nextLine());
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        karyawanX.statusKawin(scanner.nextLine());
    }
    
    public static void main(String[] args) {
        karyawanX = new Karyawan();
        inputData();
        karyawanX.hitungGaji();
    }
    
}

