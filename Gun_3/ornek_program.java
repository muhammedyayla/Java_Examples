package Gun_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ornek_program {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
/*      Klavyeden -1 değeri girilinceye kadar sürekli sayı okuyup, bu
        sayıların ortalamasını ekrana yazdıran Java programını yazınız */

        int sayi=0, toplam=0, sayac=0;
        float ortalama;
        while (sayi!= -1){
            System.out.println("Bir sayı giriniz");
            String s = br.readLine();
            sayi=Integer.parseInt(s);
            toplam +=sayi;
            sayac++;
        }
        ortalama = (float) toplam / --sayac; 
        // önce sayacı çıkarmamızın sebebi -1 diyincede bir ekliyor onu önce çıkartıyoruz
        // önce toplam arttır sebebi son girilen -1 dahil etmemek
        System.out.println("ORTALAMA " + ortalama);
    }
}
