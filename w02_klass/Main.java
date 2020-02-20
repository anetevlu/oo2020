public class Main{
    public static void main(String[] arg){
        Kodutoo2 vanur1 = new Kodutoo2("Maali", 50);
        Kodutoo2 vanur2 = new Kodutoo2("Valdur", 58);

        System.out.println((vanur1.millalPensionile()) + " aastat pensionini");
        System.out.println((vanur2.millalPensionile()) + " aastat pensionini");
    }
}
/*
Maali - 15 aastat pensionini
Valdur - 7 aastat pensionini
*/
