/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MarkahKeseluruhan {
public static void main (String []args) {
     
         double FOP = 87;
         double COA =90;
         double WP =68;
         double SI =50;
         double jumlah;
         double purata;
         double peratus;
         
         jumlah=FOP+COA+WP+SI;
         purata=(FOP+COA+WP+SI);
         peratus=((FOP+COA+WP+SI)*100)/400;
         
System.out.println("_________");
System.out.println("Fundaimental Of Programming="+FOP+ "\t Computer Organization and Architercture="+COA);
System.out.println("Web Programming="+WP+ "\t\t System Interface="+SI);

System.out.println("Jumlah Markah="+jumlah);
System.out.println("Purata Markah ="+purata);
System.out.println("Peratus Markah ="+peratus);        
         
}
    
}
