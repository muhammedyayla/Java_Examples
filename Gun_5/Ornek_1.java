package Gun_5;
public class Ornek_1 {
    public static void main(String[] arStrings){
        kare ka = new kare();
        kare re = new kare(5.0);

        System.out.println("ka.kenar = " + ka.kenar);
        System.out.println("re.kenar = " + re.kenar);
        System.out.println();

        ka = re;
        System.out.println("ka.kenar = " + ka.kenar);
        System.out.println("re.kenar = " + re.kenar);
        System.out.println();

        re = new kare(10.0);
        System.out.println("ka.kenar = " + ka.kenar);
        System.out.println("re.kenar = " + re.kenar);
        System.out.println();
    }
}
