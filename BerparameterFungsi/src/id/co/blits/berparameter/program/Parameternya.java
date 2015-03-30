/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.berparameter.program;
import java.util.*;
/**
 *
 * @author 1
 */
public class Parameternya {
int panjang,lebar,keliling;
void keliling_persegi (int pjg, int lbr,int kllng){
    pjg = panjang;
    lbr = lebar;
    kllng = 2*(pjg+lbr);
    System.out.println("hitung persegi:"+kllng);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Parameternya hitung;
    hitung = new  Parameternya();
    System.out.println("=>Berparameter<=");
    System.out.println("Masukan Panjang : ");
    hitung.panjang = new Scanner(System.in).nextInt();
    System.out.println("Masukan Lebar : ");
    hitung.lebar = new Scanner(System.in).nextInt();
    hitung.keliling_persegi(hitung.panjang, hitung.lebar,hitung.keliling);
    }
    
}
