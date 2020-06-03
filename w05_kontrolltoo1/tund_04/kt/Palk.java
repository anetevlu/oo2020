//Failis on viie aasta kohta koefitsiendid, kui palju igal aastal palk muutus. 
//Samuti esimese aasta palk. Väljasta teise faili palk igal aastal neist ning võrdlusena
//kõrvale palk, kui sama alg- ja lõppsumma juures olnuks koefitsient arvutatud geomeetrilise keskmise abil.
import java.io.*;
public class Palk{
    public static void main(String[] arg) throws Exception{
        double[] koef = new double[5];
        BufferedReader br1 = new BufferedReader(new FileReader("palgad.txt"));
        double puhver = 1;
        for(int i = 0; i<koef.length; i++){
            koef[i] = Double.parseDouble(br1.readLine());
            puhver = puhver*koef[i];
        }
        double palk = Double.parseDouble(br1.readLine());
        double tingpalk = palk;
        double kkoef = Math.pow(puhver, (1.0/koef.length));
        br1.close();

        PrintWriter pw1 = new PrintWriter("palgadv.txt");
        pw1.println(palk);
        for(int i = 0;  i<koef.length; i++){
            palk = palk*koef[i];
            tingpalk *= kkoef;
            pw1.println(koef[i]+ " " + palk + " " + tingpalk);
        }
        pw1.close();
    }
} 