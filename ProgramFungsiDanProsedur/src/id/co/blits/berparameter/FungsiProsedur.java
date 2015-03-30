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
public class FungsiProsedur {
 static int Kuadrat(int bil){
     return bil*bil;
   }
    //System.out.println("luas persegi panjang : "+luas);  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int nilai_kuadrat;
      System.out.print("Masukan Kuadrat : ");
    nilai_kuadrat = new Scanner(System.in).nextInt();
   System.out.println(nilai_kuadrat +" kuadrat adalah "+ Kuadrat(nilai_kuadrat));
   }
 }
 
