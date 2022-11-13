package Gun_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 while (<boolean ifade>)
{
<deyim bloğu>
}
            • boolean ifade doğru olduğu sürece döngü çalışacaktır.
 */
public class while_dongusu {

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
         while (sayi != 0) {
             basamak = sayi%10;
             System.out.println(basamak);
             sayi = (sayi-basamak)/10;
        }
        // for (int i = 0; i!=0; i++) {
        //     basamak= sayi%10;
        //     System.out.println(basamak);
        //     sayi= (sayi-basamak)/10;
        // }
    }
}