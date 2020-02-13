import java.util.*;

public class Kodutoo1 {

    public static ArrayList<Integer> jagajateLoetelu(int arv){
        ArrayList<Integer> loetelu = new ArrayList<Integer>();
        int jagaja = 2;
        while(arv != 1){
            if(arv % jagaja == 0){
                loetelu.add(jagaja);
                arv = arv/jagaja;
                jagaja = 2;
            } else {jagaja++;}
        }
    return loetelu;
    }
    
    public static ArrayList<Integer> jagajad(int arv1, int arv2){
        ArrayList<Integer> jagajad1 = jagajateLoetelu(arv1);
        ArrayList<Integer> jagajad2 = jagajateLoetelu(arv2);
        ArrayList<Integer> koikJagajad = new ArrayList<Integer>();     
        System.out.println(jagajad1);   
        System.out.println(jagajad2);

        koikJagajad.addAll(jagajad1);
        for(int arv: jagajad1){
            if(jagajad2.contains(arv)){                
                jagajad2.remove(new Integer(arv));
            }
        }
        koikJagajad.addAll(jagajad2);
        System.out.println(koikJagajad);
        
        return koikJagajad;
    }
       
   public static int jagajateKorrutis(ArrayList<Integer> tegurid){
        int puhver = 1;
        for(int arv: tegurid){
            puhver = puhver * arv;
        }        
        return puhver; 
    }

    public static int VYT(int arv1, int arv2){
        int vyt = jagajateKorrutis(jagajad(arv1, arv2));    
        return vyt;    
    }


    public static void main(String[] arg){
        System.out.println(VYT(8,6));
    }
}
