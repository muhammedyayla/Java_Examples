package Gun_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class küçüküyazdır {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        /*Klavyeden girilen 2 reel sayıdan önce küçük olanını sonra
        büyük olanını ekrana yazdıran Java Programını yazınız. */
        float sayi1,sayi2;
        System.out.println("Sayı giriniz");
        String s = br.readLine();
        sayi1 = Float.parseFloat(s);
        System.out.println("Yeni sayı giriniz");
        s = br.readLine();
        sayi2 = Float.parseFloat(s);
    
        if (sayi1<sayi2){
            System.out.println("Küçük sayı = " + sayi1);
            System.out.println("Büyük sayı = " + sayi2);
        }
        else 
        {
            System.out.println("Küçük sayı = " + sayi2);
            System.out.println("Büyük sayı = " + sayi1);
        }
    }
}
