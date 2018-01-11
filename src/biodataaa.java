/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Biodataaa {
 public static void main(String[]args){
    String nama_dp,nama_blk,alamat,bandar,tmpt_lahir,tarikh_lahir;
    Scanner biodata = new Scanner (System.in);
    System.out.println ("Masukkan data data anda");
    System.out.print ("Nama Depan=");
    nama_dp=biodata.nextLine();
    System.out.print ("Nama Belakang=");
    nama_blk=biodata.nextLine();
    System.out.print ("alamat=");
    alamat=biodata.nextLine();
    System.out.print ("Bandar=");
    bandar=biodata.nextLine();
    System.out.print ("Tempat Lahir=");
    tmpt_lahir=biodata.nextLine();
    System.out.print ("Tarikh Lahir=");
    tarikh_lahir=biodata.nextLine();
    System.out.println("=================");
    System.out.println("    Biodataku   ");
    System.out.println("=================");
    System.out.println("Nama Lengkap="+nama_dp+""+nama_blk);
    System.out.println("Alamat="+alamat+""+nama_blk);
    System.out.println("Tempat, Tarikh Lahir="+tmpt_lahir+""+tarikh_lahir);
    }
}
