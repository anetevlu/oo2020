public class Proov2{
    public static void main(String[] arg){
        PunktmassiPaar paar1=new PunktmassiPaar(
           new Punktmass1_klass(5, 3),
           new Punktmass1_klass(2, 10)
        );
        PunktmassiPaar paar2=new PunktmassiPaar(
          paar1, 
          new Punktmass1_klass(10, 15)
        );
        System.out.println(paar1.massikeseX());
        System.out.println(paar2.massikeseX());
        System.out.println(paar2.tekstina());
    }
}

/* koosta mudel massidele, kus أ¼he punktmassi moodustab olemasolev paar
 5kg kohal 3 + 2kg kohal 10
 
 ning teiseks punktmassiks on 10 kg punktmass kohal 15
 
 Kuvage terviksأ¼steemi massikeskme X
 */