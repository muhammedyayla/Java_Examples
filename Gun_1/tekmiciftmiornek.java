package Gun_1;

/**
 * elseifornek
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tekmiciftmiornek {
    public static void main(String[] args) throws IOException {
        // Klavyeden girilen bir sayının tek mi, yoksa çift mi olduğunu
        // bulup ekrana yazdıran programı yazınız.

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Sayı giriniz");
        String sayi = br.readLine();
        int s = Integer.parseInt(sayi);    

        if (s%2 == 0){
            System.out.println("Sayı Çifttir");
        }
        else {
            System.out.println("Sayı tektir");
        }
}
}