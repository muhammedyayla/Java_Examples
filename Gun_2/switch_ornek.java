package Gun_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_ornek {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        /*• 
        Klavyeden girilen iki sayı üzerinde switch komutu kullanarak
        çarpma, bölme, toplama ve çıkarma yapan Java programını
        yazınız */
        int sayi1,sayi2;
        System.out.println("+ - * /");
        String s = br.readLine();
        char c = s.charAt(0);
        System.out.println("1. sayıyı girin");
        s = br.readLine();
        sayi1 = Integer.parseInt(s);
        System.out.println("2. sayıyı girin");
        s = br.readLine();
        sayi2 = Integer.parseInt(s);

        switch (c) {
            case '+': System.out.println("Sonuç = " + (sayi1 + sayi2));break;
            case '-': System.out.println("Sonuç = " + (sayi1 - sayi2));break;
            case '*': System.out.println("Sonuç = " + (sayi1 * sayi2));break;
            case '/': System.out.println("Sonuç = " + (sayi1 / sayi2));break;
            default: System.out.println("yanlış operatör girdiniz");
        }
    }
}
