import java.util.ArrayList;

//Loo retsepti järgi toit (nt. kartulisalat), küsi salatis leiduvate toitainete kogused. DONE
//Koosta rakendus, kus näidatakse valitud toidu etteantud koguse (nt. 5 kg kartulisalati) jaoks vajalikud toiduained.

public class Toit{
    String nimetus;
    ArrayList<Toidukomponent> tkomponendid;

    public Toit(String unimetus, ArrayList ukomponendid){
        nimetus = unimetus; 
        tkomponendid = ukomponendid;
    }

    public double kogusKokku(){
        double kogusKokku = 0;
        for(int i = 0; i < tkomponendid.size(); i++){
            kogusKokku += tkomponendid.get(i).kysiKogus();
        }
        return kogusKokku;
    }

    public double toidusRasva(){
        double rasvKokku = 0;
        for(int i = 0; i < tkomponendid.size(); i++){
            rasvKokku += tkomponendid.get(i).leiaRasvakogus();
        }
        return rasvKokku;
    }

    public double toidusValke(){
        double valkKokku = 0;
        for(int i = 0; i < tkomponendid.size(); i++){
            valkKokku += tkomponendid.get(i).leiaValgukogus();
        }
        return valkKokku;
    }

    public double toidusSysivesikuid(){
        double sysivesikKokku = 0;
        for(int i = 0; i < tkomponendid.size(); i++){
            sysivesikKokku += tkomponendid.get(i).leiaSysikogus();
        }
        return sysivesikKokku;
    }
}