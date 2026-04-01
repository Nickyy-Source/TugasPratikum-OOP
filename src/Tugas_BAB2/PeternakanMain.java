/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB2;

/**
 *
 * @author Nico Dharma
 */
public class PeternakanMain {
    public static void main(String[] args) {

        // Membuat objek dari Data_Peternakan
        Data_Peternakan data = new Data_Peternakan();

        System.out.println("====== DATA PETERNAKAN ======");
        System.out.println("Jumlah Sapi     : " + data.sapi);
        System.out.println("Jumlah Ayam     : " + data.ayam);
        System.out.println("Jumlah Kambing  : " + data.kambing);
        System.out.println("Jumlah Babi     : " + data.babi);
        System.out.println("Jumlah Bebek    : " + data.bebek);
        System.out.println("-----------------------------");
        System.out.println("Total Hewan     : " + data.Total_Hewan());
        System.out.println("=============================");
    }
}
