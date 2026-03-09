/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1.ClassObject;

/**
 *
 * @author Nico Dharma
 */
public class Main {
    public static void main(String[] args) {

        // membuat objek
        Hewan hewan = new Hewan();

        hewan.nama = "Anjing";
        hewan.usia = "3 Tahun";
        hewan.jeniskelamin = "Betina";

        System.out.println("Nama Hewan    : " + hewan.nama);
        System.out.println("Usia Hewan    : " + hewan.usia);
        System.out.println("Jenis Kelamin : " + hewan.jeniskelamin);

        System.out.println(" ========== Data Riwayat Hewan ========== ");
        System.out.print("Tahun Lahir     : "); 
        hewan.tahunLahir();

        System.out.print("Penyakit Bawaan : "); 
        hewan.penyakit();

        System.out.print("Makanan Favorit : "); 
        hewan.makanan();
    }
}
