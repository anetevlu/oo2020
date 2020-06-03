public class Proov1{
    public static void main(String[] arg){
        PunktmassiPaar paar1=new PunktmassiPaar(
           new Punktmass1_klass(5, 3),
           new Punktmass1_klass(2, 10)
        );
        System.out.println(paar1.massikeseX());
    }
}

/* koosta mudel massidele, kus أ¼he punktmassi moodustab olemasolev paar
 5kg kohal 3 + 2kg kohal 10
 
 ning teiseks punktmassiks on 10 kg punktmass kohal 15
 
 Kuvage terviksأ¼steemi massikeskme X
 */