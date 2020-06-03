public class Proov2{
    public static void main(String[] arg){
        Ala ala1 = new Ala(new Vektor2D(90, 0), new Vektor2D(0, 30)); //kogu ala
        //Ala ala2 = new Ala(new Vektor2D(0, 5), new Vektor2D(15, 25)); //värav 1
        //Ala ala3 = new Ala(new Vektor2D(75, 5), new Vektor2D(90, 25)); //värav 2
        System.out.println(ala1);

        Vektor2D palliKoht = new Vektor2D(1, 15);
        System.out.println(ala1.kasAlas(palliKoht));

        Paiknemine palliPaiknemine = new Paiknemine(palliKoht, new Vektor2D(10, 0));
        System.out.println(ala1.kasAlas(palliPaiknemine.kysiAsukoht(1)));
        
        for(int sekund = 0; sekund < 12; sekund++){
        Ala[] alad = new Ala[3];
        alad[0] = new Ala(new Vektor2D(0, 0), new Vektor2D(90, 30));
        alad[1] = new Ala(new Vektor2D(0, 5), new Vektor2D(15, 25));
        alad[2] = new Ala(new Vektor2D(75, 5), new Vektor2D(90, 25));
        System.out.println(sekund);
            for(int i=0; i<alad.length; i++){
                System.out.println(alad[i].kasAlas(palliPaiknemine.kysiAsukoht(sekund)));
            }
        }
        //väravavaht lööb palli oma värava eest keskelt otse teise värava suunas kiirusega 10 m/s
        //kuva iga sekundi järel milliste alade sees pall on
    }
}