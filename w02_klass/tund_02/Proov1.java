public class Proov1{
    public static void main(String[] arg){
        Kilpkonnatuup1 hallloom = new Kilpkonnatuup1(1, 1, "lõuna");
        Kilpkonnatuup1 mustloom = new Kilpkonnatuup1(3, 2, "ida");
        hallloom.edasi();
        mustloom.edasi();
        System.out.println(hallloom.kysix());
        System.out.println(mustloom.kysix() - mustloom.kysix());

        hallloom.paremale();
        System.out.println(hallloom);
        hallloom.paremale();
        System.out.println(hallloom);
        hallloom.paremale();
        System.out.println(hallloom);
        hallloom.paremale();
        System.out.println(hallloom);
    }
}