package Gun_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ornek {
    public static void main(String[] args) throws IOException {
        //Kılavyeden girilen sayının 3 fazlasını ekrana yazdıran programı yazınız.

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("sayı giriniz");
        String sayi = br.readLine();

        int sayim = Integer.parseInt(sayi);
        sayim = sayim + 3; 

        System.out.println("Girilen sayı= " + sayim);    
    }
}
