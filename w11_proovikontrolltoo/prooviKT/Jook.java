public class Jook{
    String nimetus;
    double omahind; //eur/liiter
    double erikaal; //kg/liiter

    public Jook(String unimetus, double hind, double ekaal){
        nimetus = unimetus;
        omahind = hind;
        erikaal = ekaal;
    }

    public String kysiNimetus(){
        return nimetus;
    }

    public double kysiErikaal(){
        return erikaal;
    }

    public double kysiOmahind(){
        return omahind;
    }

    public String toString(){
        return nimetus + " " + omahind + " eur/liiter " + erikaal + " kg/liiter";
    }
}
/*
Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. 
Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. 
Samuti sees olev Jook, mis võib ka puududa. 
Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), 
samuti käsklus sellise komplekti omahinna leidmiseks. 
Koosta tööks automaattestid.
*/