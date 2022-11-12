package Gun_1;

/**
 * ifornek
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifornek {

    public static void main(String[] args) throws IOException {
        // 100 üzerinden girilen bir not için; 50’den küçükse “Kaldı” 
        // 50 veya daha büyükse “Geçti” yazdıran Java programını yazınız.

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Not giriniz");
        String sayi = br.readLine();
        int not =Integer.parseInt(sayi);
        if (not<50 && not>=0){
            System.out.println("Kaldı");
        }
        else if (not >=50 && not <=100){
            System.out.println("Geçti");
        }
        else {
            System.out.println("Geçerli not giriniz");
        }
    }
}