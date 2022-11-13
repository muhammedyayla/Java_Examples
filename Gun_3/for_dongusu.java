package Gun_3;

public class for_dongusu {
    public static void main(String[] args){

        /*
        1 ile 100 arasındaki tam sayıların, tek sayıların ve çift sayıların
        toplamını tek döngüde hesaplayan java programını yazınız. */
        int tam=0, tek=0, cift=0;
        for (int i = 1; i < 101; i++) {
            tam = tam + i;
            if(i%2 != 0)
                tek = tek + i;
            else 
            cift += i;
        }
        System.out.println("tam sayıların toplamı= " + tam);
        System.out.println("tek sayıların toplamı= " + tek);
        System.out.println("çift sayıların toplamı= " + cift);
    }
}
