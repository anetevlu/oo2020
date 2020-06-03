public class Proov{
    public static void main(String[] arg){
        Vektor2D v1 = new Vektor2D(4, 2);
        Vektor2D v2 = new Vektor2D(1, 2);

        Paiknemine pallikoht = new Paiknemine(v1, v2);
        System.out.println(pallikoht);
        System.out.println(pallikoht.kysiKiirus().kysiX());
        System.out.println(pallikoht.kysiAsukoht(2));
    }

}