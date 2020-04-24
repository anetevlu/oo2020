public class Joogivaat{
    double ruumala;
    Jook sisu;
    double jookiVaadis; //liitrid
    
    public Joogivaat( Jook usisu, double uruumala, double ujookiVaadis){
        ruumala = uruumala;
        sisu = usisu;
        jookiVaadis = ujookiVaadis; 
    }

    //Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub)
    public void taidaPudel(Joogipudel p){
        if(p.kysiSisu() == null){
            if(p.kysiMaht() <= jookiVaadis){
                p.uusSisu(sisu);
                jookiVaadis -= p.kysiMaht();
            }
        }
    }

    public void taida(Joogipudel[] pudelid){
        for(int i=0; i<pudelid.length; i++){
            taidaPudel(pudelid[i]);
        } 
    }

    public double kysiTaidetud(){return jookiVaadis;}

    public String toString(){
        return ruumala + " 1 vaat sisuga " + sisu + ", sees on " + jookiVaadis;
    }
}