/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author NITRO V 15
 */
public class tugas3 {

    public static void main(String[] args) {
        double saldo = 2500000; // Saldo awal
        double bunga = 0.15; // Bunga bulanan
        
        for (int bulan = 1; bulan <= 6; bulan++) {
            saldo += saldo * bunga; // Menghitung saldo dengan bunga
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldo);
        }
    }
}
   

