/* Võimalda toidu andmeid kirjutada tekstifaili(desse) ja lugeda tagasi.
 Võib eeldada, et toiduaine, toidukomponendi ning toidu nimetus on unikaalne. 
 Kontrolli töö õigsust automaattestidega.
*/

public class Toiduaine{
    String nimetus;
    double valgud, rasvad, susivesikud; //protsent, kokku summa 100, üle ei tohi olla -> veateade

    public Toiduaine(String unimetus, double uvalgud, double urasvad, double ususivesikud){
        nimetus = unimetus; valgud = uvalgud; rasvad = urasvad; susivesikud = ususivesikud;

        double kokkuProtsent = valgud + rasvad + susivesikud;
        if(kokkuProtsent >= 100){
            System.out.println("Toiduaine koostisainete protsent kokku ületab 100%!!");
        }
    }

    public double kysiRasv(){return rasvad;}
    public double kysiValk(){return valgud;}
    public double kysiSysivesik(){return susivesikud;}
    public String kysinimetus(){return nimetus;}

    public String toString(){
        return "Nimetus: " + nimetus + ", valgud: " + valgud + "%, rasvad: " + rasvad + "%, süsivesikud: " + susivesikud + "%";
    }
}