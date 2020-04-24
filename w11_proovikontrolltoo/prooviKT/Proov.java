public class Proov{
    public static void main(String[] arg){
        Jook jook1 = new Jook("limonaad", 0.7, 1.05);
        Joogipudel pudel1 = new Joogipudel(jook1, 0.5, 0, 0.2, 0.1);

        System.out.println(jook1.kysiNimetus());
        System.out.println(pudel1);
        System.out.println(pudel1.kysiMass());
        System.out.println(pudel1.omahind());
    }
}