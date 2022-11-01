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
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in).useDelimiter("\n");
     System.out.println("Apakah anda mahasiswa Poliban ? (Y jika setuju");
     String jawaban =scan.next();
     if("Y".equals(jawaban)){
         System.out.println("Selamat berjuang di Poloban");
     }else{
         System.out.println("Selamat datang di Poliban");
     }
    }
}
