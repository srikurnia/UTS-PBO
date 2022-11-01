/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sri Kurnia
 */
import java.util.Scanner;
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String  jawaban, jawaban1;
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.print("Apakah anda mahasiswa ?(iya)");
       jawaban1 = scan.next();
       if(("tidak".equals(jawaban1))||("TIDAK".equals(jawaban1))){
       System.out.print("Bagus, Pertahankan!!!");
    }
   }
}

