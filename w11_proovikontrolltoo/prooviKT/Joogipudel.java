public class Joogipudel{
    Jook sisu;
    double maht; //liiter
    int pudelityyp; // 0 - klaas, 1 - plastik
    double mass; //kg
    double taarahind;

    public Joogipudel(Jook usisu, double umaht, int tyyp, double umass, double taara){
        sisu = usisu;
        maht = umaht;
        pudelityyp = tyyp;
        mass = umass;
        taarahind = taara;
    }

    public String toString(){
        return "Sisu: " + sisu + " taara " + ((pudelityyp == 0)?" klaas ":" plastik ") + mass + " kg, " + taarahind + " eur.";
    }

    public double kysiMass(){
        if(sisu == null){return mass;}
        return mass + maht*sisu.kysiErikaal();
    }

    public double omahind(){
        if(sisu == null){return taarahind;}
        return taarahind + maht*sisu.kysiOmahind();
    }

    public double kysiMaht(){return maht;}
    public Jook kysiSisu(){return sisu;}
    public void uusSisu(Jook j){sisu = j;}

}