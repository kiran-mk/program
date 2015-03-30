/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.berparameter;
import java.util.*;
/**
 *
 * @author 1
 */
public class MethotBerparameter {
 int panjang;
     int lebar;
     int tinggi;
     int volume;
     // pembuatan method hitung volume dengan jenis non void/ mengembalikan nilai.
     public int HitungVolume(){
          volume = panjang * lebar * tinggi; // panjang, lebar, tinggi sudah dideklarasikan di method void.
          return volume;
     }
     public void SetData(int p, int l, int t){
          panjang = p;
          lebar = l;
          tinggi = t;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   MethotBerparameter obj = new MethotBerparameter();
          obj.SetData(10,20,5);
          System.out.println("Volume Balok adalah " + obj.HitungVolume());
     }
}
  
