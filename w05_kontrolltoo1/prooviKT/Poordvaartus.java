//Arve võib olla rohkem, need antakse ette kogumina. Arvud korrutatakse kokku 
//ning võetakse niimitmes juur (astendaja pöördväärtus, Math.pow), kuimitu arvu oli.
import java.lang.Math;
public class Poordvaartus{
    public static void main(String[] arg){
        double[] arvud = {2, 5, 8, 1, 7};
        double arvudK = 1.0;
        int loendur = 0;
        for(int i = 0; i < arvud.length; i++){
            arvudK = arvudK*arvud[i];
            loendur++;
        }       
        double astendaja = 1.0/loendur;
        System.out.println(arvudK);
        System.out.println(loendur);
        System.out.println(Math.pow(arvudK, astendaja));
    }

}  