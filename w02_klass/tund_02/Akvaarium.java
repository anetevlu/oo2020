public class Akvaarium{
    public static void main (String[] arg){
        Harjutus tavalisedKalad = new Harjutus(30, 50, 90, 15000);
        System.out.println("Akvaariumi ruumala: " + tavalisedKalad.akvaariumiV());
        System.out.println("Akvaariumi kõrgus: " + tavalisedKalad.kysiKorgus());
        System.out.println("Veesamba kõrgus: " + tavalisedKalad.veeKorgus());
        tavalisedKalad.lisaVett(5.0);
        System.out.println("Veesamba kõrgus nüüd: " + tavalisedKalad.veeKorgus());



    }
}