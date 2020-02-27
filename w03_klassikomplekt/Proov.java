public class Proov{
    public static void main(String[] arg){
        Pood juustupood = new Pood(20);
        JuustuLadu juustuladu = new JuustuLadu(50, juustupood);
        

        System.out.println("Juustulaos on " + juustuladu.kysiLaoKogus() + " ja juustupoes " + juustupood.kysiPoeKogus() + " juustu.");
        System.out.println("Osteti 5 juustu, poes alles " + juustupood.lahuta(5));
        System.out.println("Kas poodi juustu vaja: " + juustuladu.kasPoodiVaja());
    }

}
/*
Juustulaos on 50 ja juustupoes 20 juustu.
Osteti 5 juustu, poes alles 15
Kas poodi juustu vaja: false
*/