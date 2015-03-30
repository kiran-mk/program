/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.parameter;
import java.util.*;

/**
 *
 * @author 1
 */
public class ProsedurFungsi {
int panjang,lebar,luas;
void luas_persegi(){
    System.out.print("Masukan Panjang : ");
    panjang =new Scanner(System.in).nextInt();
    System.out.print("Masukan Lebar : ");
    lebar=new Scanner(System.in).nextInt();
    luas=panjang*lebar;
    System.out.println("luas persegi panjang : "+luas);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
    ProsedurFungsi hitung;
    hitung = new ProsedurFungsi();
    hitung.luas_persegi();
    
    }
    
}
