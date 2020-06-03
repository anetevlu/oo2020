public class Toidukomponent{
    double kogus;
    Toiduaine koostis;

    public Toidukomponent(double ukogus, Toiduaine ukoostis){
        kogus = ukogus; koostis = ukoostis;
    }

    public double leiaRasvakogus(){
        double kogurasv = (kogus*(koostis.kysiRasv()))/100;
        return kogurasv; 
    }

    public double leiaValgukogus(){
        double koguvalk = (kogus*(koostis.kysiValk()))/100;
        return koguvalk; 
    }

    public double leiaSysikogus(){
        double kogusysivesik = (kogus*(koostis.kysiSysivesik()))/100;
        return kogusysivesik; 
    }

    public double kysiKogus(){return kogus;}

    public String nimetus(){return koostis.kysinimetus();}

    public String toString(){
        return koostis + ", kogus: " + kogus + "g.";
    }
}