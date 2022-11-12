package Gun_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class fatura_hesap {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        /*Bu program elektrik faturasını tüketilen watta’a bağlı olarak
        hesaplar.
        • 100 birim watta kadar 200 TL
        • 100 < birim watt <200 için
        200 + (birim watt-100)* 5 TL
        • 200 <birim watt <300 için
        200 + 100 * 5 + (birim watt – 200) * 6 TL
        • birim watt > 300 için
        200 + 100 * 5 + 100 * 6 + (birim watt -300) * 8 TL */
        System.out.println("Voltaj değerini giriniz");
        String s = br.readLine();
        int watt = Integer.parseInt(s);
        int fatura;
        if (watt >100)
        {
            if (watt >200)
            {
                if (watt >300)
                {
                    fatura = 200 + 100 * 5 + 100 * 6 + (watt -300)* 8;
                }
                else
                fatura = 200 + 100 * 5 + (watt-200) * 6;
            }
            else 
            fatura = 200 + (watt-100)* 5;
        }
        else 
        fatura = 200;
        System.out.println("Ödenecek fatura = " + fatura);
    }
}
