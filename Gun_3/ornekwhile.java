package Gun_3;

/**
 * ornekwhile
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ornekwhile {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        /*
        Klavyeden girilen herhangi bir tamsayının basamaklarını ayrı
        ayrı ekrana yazdıran Java programını yazınız.*/
        int sayi,basamak;
        System.out.println("Bir sayı giriniz.");
        String s = br.readLine();
        sayi = Integer.parseInt(s);

        if(sayi < 10){
            sayi = 0 - sayi;
        }
        else
            if (sayi==0){
                System.out.println(sayi);
            }
        while(sayi != 0 ){
            basamak = sayi % 10;
            System.out.println(basamak);
            sayi = (sayi-basamak)/10;
        }
    }
}