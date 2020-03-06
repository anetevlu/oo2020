import java.util.*;
public class Kontrolltoo{

    public static void main(String[] arg){        
        int arv=Integer.parseInt(arg[0]);
        System.out.println(kumnendsusteemi(arv)); // 5
        System.out.println(kasBinary(arv));
        System.out.println(arvListiks(arv));
    }

    public static boolean kasBinary(int arv){
        ArrayList<Integer> arvud = arvListiks(arv);
        System.out.println(arvud);
        for(int i = 0; i < (arvud.size() - 1); i++){
            if(arvud.get(i) != 1 && arvud.get(i) != 0){
                return false;
            } 
                
        } 
        return true;
                                    
    } 

    public static ArrayList<Integer> arvListiks(int arv){        
        ArrayList<Integer> arvud = new ArrayList<Integer>();
        for(int i = 0; i < 4; i++){
            int d = arv / 10;
            int k = arv % 10;
            arv = d;
            arvud.add(k);            
        }
        Collections.reverse(arvud);
        return arvud;
    }
        
    public static int kumnendsusteemi(int arv1){  
        int arv2 = 0;  
        int n = 0;  
        while(true){ 
            if(arv1 == 0){
                break;  
            } else {  
                int temp = arv1%10;  
                arv2 += temp*Math.pow(2, n);  
                arv1 = arv1/10;  
                n++;  
            }  
        } 
        return arv2;  
    } 
}
