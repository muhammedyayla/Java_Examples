package Gun_2;

/**
 switch (ifade) {
case <sabit 1>: <deyim 1>;
case <sabit 2>: <deyim 2>;
case <sabit n>: <deyim n>;
default: <deyim>;
}
        switch deyiminde default satırı yazılmak zorunda değildir.
        break deyimi, bir case satırında çalıştığı zaman program akışını
        switch’in dışına taşır.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcase {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        /*
        Aşağıda hata kodları ve mesajları verilmektedir. Klavyeden
        girilen hata koduna ilişkin hata mesajını ekrana yazdıran Java
        programını switch yapısını kullanarak yazınız.
        1 OK
        2 WARNING
        3 ERROR
        4 PANIC
        5 UNKNOWN
         */

         System.out.println("Bir hata kodu giriniz.");
         String s = br.readLine();
         int hataKodu = Integer.parseInt(s);

         switch (hataKodu) {
            case 1: System.out.println("OK");break;
            case 2: System.out.println("WARNING");break;
            case 3: System.out.println("ERROR");break;
            case 4: System.out.println("PANIC");break;
            case 5: System.out.println("UNKNOWN");break;
            default: System.out.println("Hatalı kod girdiniz");
         }
    }

}