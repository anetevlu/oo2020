public class Liitmine{
    public static void main(String[] arg){
        Vektor2D vektor1 = new Vektor2D(5, 2);
        Vektor2D vektor2 = new Vektor2D(1, 1);
        Vektor2D vektor3 = vektor1.liida(vektor2);

        //System.out.println(vektor1.liida(vektor2));
        System.out.println(vektor3.kysiX() + ", " + vektor3.kysiY());
        System.out.println(vektor3);
        System.out.println(vektor1.korrutis(2.0));

    }

}