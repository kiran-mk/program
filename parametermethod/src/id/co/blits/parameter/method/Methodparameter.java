/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.parameter.method;
import java.util.*;
/**
 *
 * @author 1
 */
public class Methodparameter {
static void Cetak(int nilai){
     System.out.println("Nilai"+nilai);
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nilai;
   for (nilai=0; nilai<3; nilai++){
        Cetak(nilai);
   }
   System.out.println("Nilairakhir: "+nilai);
   }
 }
 