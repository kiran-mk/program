/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.tanpaparameter;
import java.util.*;
/**
 *
 * @author 1
 */
public class TanpaParameter {
     int panjang;
     int lebar;
     int tinggi;
     int volume;
 // pembuatan method hitung volume dengan jenis non void/ mengembalikan nilai.
     public int HitungVolume(){
           volume = panjang * lebar * tinggi;
           return volume;
      }
 //pembuatan method hitung volume dengan jenis void/tanpa mengembalikan data.
     public void TampilVolume(){
           System.out.println("Hasil Volume balok adalah " + panjang * lebar * tinggi);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     TanpaParameter obj = new TanpaParameter();
          obj.panjang = 10;
          obj.lebar = 5;
          obj.tinggi = 4;

          //pemanggilan non void/dengan pengembalian data.
          System.out.println("Volume Balok adalah " + obj.HitungVolume() * 5);

          //pemanggilan non void/dengan pengembalian data.
          obj.TampilVolume();
    }
    
}
