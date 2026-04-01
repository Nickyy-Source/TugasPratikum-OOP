/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB2;

/**
 *
 * @author Nico Dharma
 */
public class Data_Peternakan {
    int sapi, ayam, kambing, babi, bebek;
    int total;

    // Constructor default
    public Data_Peternakan(){
        this.sapi = 12;
        this.ayam = 10;
        this.kambing = 11;
        this.babi = 10;
        this.bebek = 10;
    }

    // ✅ Constructor dengan parameter (seperti contoh kamu)
        public Data_Peternakan(int sapi, int ayam, int kambing, int babi, int bebek){
            this.sapi = sapi;
            this.ayam = ayam;
            this.kambing = kambing;
            this.babi = babi;
            this.bebek = bebek;
    }

    // method perhitungan total hewan
    public int Total_Hewan(){
        total = sapi + ayam + kambing + babi + bebek;
        return total;
    }
}