public class Arvutus1{
    public static void main(String[] arg){
        int arv=Integer.parseInt(arg[0]);
        System.out.println(arv*2);
        for(int i=0; i<arv; i++){
            //System.out.println(i+". tere");
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" "+i+". tere");
        }
    }
}