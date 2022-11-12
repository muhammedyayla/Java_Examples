package Gun_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class enbüyükbul {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        /*• Klavyeden girilen 3 tamsayıdan en büyüğünü bulup ekrana
        yazdıran Java programını yazınız.*/

        System.out.println("Sayı giriniz");
        String s = br.readLine();
        int sayi1 = Integer.parseInt(s);
        System.out.println("Sayı giriniz");
        s = br.readLine();
        int sayi2 = Integer.parseInt(s);
        System.out.println("Sayı giriniz");
        s = br.readLine();
        int sayi3 = Integer.parseInt(s);

        if (sayi1 > sayi2 && sayi1>sayi3){
            System.out.println("En büyük sayı = "+ sayi1);
        }
        else if (sayi2 > sayi1 && sayi2>sayi3)
        {
            System.out.println("En büyük sayı = "+ sayi2);
        }
        else {
            System.out.println("En büyük sayı = "+ sayi3);
        }
    }
}
