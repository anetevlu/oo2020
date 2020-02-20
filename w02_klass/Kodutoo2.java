public class Kodutoo2{
    String nimi;
    int vanus;
    int pensionIga = 65;
    int aastad;
    public Kodutoo2(String name, int age){
        nimi = name;
        vanus = age;
    }

    public int millalPensionile(){
        aastad = pensionIga - vanus;
        System.out.print(nimi + " - ");
        return aastad;
    }
}
