public class Proov2{
    public static void main(String[] arg){
        Joogivaat v1=new Joogivaat(new Jook("limonaad", 0.2, 1.1), 50, 15);

        System.out.println(v1);

        Joogipudel p1=new Joogipudel(null, 1.5, 1, 0.1, 0.2);

        System.out.println(p1);
        v1.taidaPudel(p1);
        System.out.println(v1);
        System.out.println(p1);

        Joogipudel[] pd=new Joogipudel[10];

        for(int i=0; i<pd.length; i++){
            pd[i]=new Joogipudel(null, 1.5, 1, 0.1, 0.2);
        }

        for(int i=0; i<pd.length; i++){
            v1.taidaPudel(pd[i]);
            System.out.println(pd[i]);
        }

        System.out.println(v1);
    }
}