package Gun_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        /*  do
{
<deyim bloğu>
}
while (<boolean ifade>)

            Boolean ifade yanlış olsa bile döngü en az 1 kez çalışacaktır
            boolean ifade doğru olduğu sürece döngü çalışmaya devam
            edecektir. */

public class do_while {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sayi,tekToplam=0, ciftToplam=0, tekSayac=0, ciftSayac=0;
        float tekOrtalama, ciftOrtalama;
        /* Klavyeden sıfır girilinceye kadar sürekli sayı okuyup, teklerin ve
        çiftlerin ayrı ayrı ortalaması bulan Java programını Do while
        döngü yapısını kullanarak yazınız. */
        String s;
        do {
            System.out.println("sayı giriniz");
            s = br.readLine();
            sayi = Integer.parseInt(s);
            if(sayi%2 ==0){
                ciftToplam=ciftToplam+sayi;
                ciftSayac++;
            }
            else{
                tekToplam=tekToplam+sayi;
                tekSayac++;
            }
        } while (sayi != 0);
        tekOrtalama = (float) tekToplam/tekSayac;
        ciftOrtalama= (float) ciftToplam/--ciftSayac; // 0 çift sayı olduğundan sayacı önce 1 azaltıyoruz
        System.out.println("Tekleri Ortalaması" + tekOrtalama);
        System.out.println("Çiftlerin Ortalaması" + ciftOrtalama);

    }
}
