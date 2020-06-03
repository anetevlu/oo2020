public class Paiknemine{
    Vektor2D asukoht;
    Vektor2D kiirus;

    public Paiknemine(Vektor2D uasukoht, Vektor2D ukiirus){
        asukoht = uasukoht;
        kiirus = ukiirus;
    }

    public String toString(){
        return "kohal " + asukoht + " kiirusega " + kiirus;
    }

    public Vektor2D kysiKiirus(){
        return kiirus;
    }

    public Vektor2D kysiAsukoht(){
        return asukoht; 
    }

    public Vektor2D kysiAsukoht(double sekundid){
        //(asukoht + (kiirus*sekundid));
        return asukoht.liida(kiirus.korrutis(sekundid));
    }



}