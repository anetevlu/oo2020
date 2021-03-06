import java.util.*;
public class Funktsioonid1{
    public static boolean kasJagub(int mis, int millega){
        return mis % millega == 0;
    }
    public static double geomeetrilineKeskmine(double arv1, double arv2){
        return Math.sqrt(arv1*arv2);
    }
    public static int korrutaKahega(int arv){
        return arv*2;
    }
    public static boolean kasAlgarv(int arv){
        for(int jagaja=2; jagaja<arv; jagaja++){
            if(arv % jagaja == 0){return false;}
        }
        return true;
    }
    public static void trykiJagajad(int arv){
        int jagaja = 2;
        while(arv!=1){
            if(arv % jagaja == 0){
                System.out.println(jagaja);
                arv=arv/jagaja;
                jagaja = 2;
            } else {jagaja++;}
        }
    }
    public static ArrayList<Integer> jagajateLoetelu(int arv){
        ArrayList<Integer> vastus = new ArrayList<Integer>();
        int jagaja = 2;
            while(arv!=1){
                if(arv % jagaja == 0){
                    vastus.add(jagaja);
                    arv=arv/jagaja;
                    jagaja = 2;
                } else {jagaja++;}
            }
        return vastus;
     
    }
    public static ArrayList<Integer> yhisedJagajad(int arv1, int arv2){
        ArrayList<Integer> jagajad1 = jagajateLoetelu(arv1);
        ArrayList<Integer> jagajad2 = jagajateLoetelu(arv2);
        ArrayList<Integer> vastus = new ArrayList<Integer>();
        for(int arv: jagajad1){
            if(jagajad2.contains(arv)){
                vastus.add(arv);
                jagajad2.remove(new Integer(arv));
            }
        }
        return vastus;
    }
    public static int yhisteJagajateKorrutis(ArrayList<Integer> tegurid){//funk, mis tagastab arraylistis olevate arvude korrutise
        int puhver = 1;
        for(int arv: tegurid){
            puhver = puhver * arv;
        }        
        return puhver; 
    }
    public static int SYT(int arv1, int arv2){//funk SÜT leidmiseks kasutades eelnevaid
        return yhisteJagajateKorrutis(yhisedJagajad(arv1, arv2));
    }
    public static void main(String[] arg){
        System.out.println(SYT(60, 48));
        System.out.println(yhisedJagajad(60, 48));
        System.out.println(jagajateLoetelu(60));
        trykiJagajad(60);
        System.out.println(kasAlgarv(11));   
        System.out.println(kasJagub(6, 3));
        System.out.println(korrutaKahega(7));
        System.out.println(geomeetrilineKeskmine(4, 9));
    }
} 
//kommentaar
