public class Main{
    public static void main(String[] arg){
        Toiduaine peet = new Toiduaine("peet", 10, 2, 20);
        //Toiduaine oun = new Toiduaine("õun", 20, 0.1, 15.5);

        Toidukomponent peeet = new Toidukomponent(120, new Toiduaine("peet", 10, 2, 20));
        Toidukomponent kartul = new Toidukomponent(100, new Toiduaine("kartul", 20, 0.9, 25));
        

        System.out.println(peet);
        //System.out.println(oun);
        System.out.println(peeet);
        System.out.println("Rasva on " + peeet.leiaRasvakogus() + "g.");

        System.out.println(kartul);
        System.out.println("Rasva on " + kartul.leiaRasvakogus() + "g.");
        System.out.println("Valke on " + kartul.leiaValgukogus() + "g.");
        System.out.println("Süsivesikuid on " + kartul.leiaSysikogus() + "g.");
    }
}