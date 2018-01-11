/* Anda dikhendaki membuat satu aturcara yang dapt mengesan markah yang dimasukkan adalah sama bagi dua matapelajaran.
 * contohnya mata pelajaran sains dan matematik. gunakan struktur kawalan if untuk membuat 
 * and open the template in the editor.ujian ke atas input yang dimasukkan oleh pengguna. jika gred sama, 
 *paparkan output "Gred yang diperolei tidak sama" dan sebaliknya.

/**
 *
 * @author User
 */
import java.util.Scanner;
public class soaalan2 {
public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    char sains;
    char math;
    
    System.out.println("Apakah gred bagi Sains : [A/B/C/D/E/G]");
        sains=input.next().charAt(0);
        System.out.println("Apakah gred bagi Math : [A/B/C/D/E/G]");
        math=input.next().charAt(0);
        
        if (sains==math)
                    System.out.println("Gred yang diperolehi sama");
        if (sains!=math) // also CORRECT>
                    System.out.println("Gred yang diperolehi tidak sama");
    }
}
