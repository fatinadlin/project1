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
public class gredmarkah {
        public static void main (String []args){
 
       int BI,BM,SEJ;
        double purata;
        String Ulasan;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan markah Bahasa Melayu anda :");
        BM=input.nextInt();
    
        System.out.print("Masukkan markah Bahasa Inggeris anda : ");
        BI=input.nextInt();
        
        System.out.print("Masukkan markah Sejarah anda : ");
        SEJ=input.nextInt();
    
    purata=(BM+BI+SEJ)/3;
    
    if (purata > 89){
        Ulasan="A";
       
    }else if (purata > 79){
        Ulasan="A-";
        
    }else if (purata > 69){
        Ulasan="B+";
        
    }else if (purata > 59){
        Ulasan="B";
       
    }else if (purata > 49){
        Ulasan="B-";
        
    }else if (purata > 39){
        Ulasan="C";    
        
    }else if (purata > 29){
        Ulasan="D";
        
    }else if (purata > 19){
        Ulasan="E";
        
    }
    else{
        Ulasan="G";
        
    }
    System.out.println("Gred markah anda "+Ulasan);
}
}

