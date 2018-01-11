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
public class Umur {
    public static void main(String[] args){
    
    int umur;
    String Ulasan;
    Scanner input = new Scanner(System.in);
    
     System.out.print("Masukan umur anda :");
     umur =input.nextInt();
     
     if (umur <= 45){
        Ulasan=" Anda cantik dan muda";
        
     }else {
         Ulasan=" Anda sudah tua dan perlu berehat";
     } 
     System.out.println( Ulasan);
    }
    }


