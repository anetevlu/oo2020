import java.lang.Math;
public class Ruutjuur{
    public static void main(String[] arg){
        //Koosta funktsioon, mis korrutab parameetritena antud kaks arvu ning võtab neist ruutjuure (Math.sqrt). Katseta.
        double korrutis, loppvastus;
        double arv1 = Integer.parseInt(arg[0]);
        double arv2 = Integer.parseInt(arg[1]);

        korrutis = arv1*arv2;
        loppvastus = Math.sqrt(korrutis);

        System.out.println(loppvastus);

    }
}