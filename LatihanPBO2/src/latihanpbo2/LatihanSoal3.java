/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo2;

/**
 *
 * @author Sri Kurnia
 */
import java.util.Scanner;
public class LatihanSoal3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String Nama = input.nextLine();
        System.out.print("\n Masukkan NIM : ");
        int NIM = input.nextInt();
        System.out.print("\n Masukkan Semester : ");
        int Semester = input.nextInt();
        System.out.print("\n Masukkan Kelas : ");
        String Kelas = input.next();
        System.out.println("-----Hasil----- ");
        System.out.println("Nama : "+Nama);
        System.out.println("NIM  : "+NIM);
        System.out.println("Semester : "+Semester);
        System.out.println("Kelas : "+Kelas);
    }
}
