import java.util.ArrayList;
public class Abifunktsioonid{
	public static double geomKeskmine(double[] arvud){	
		double abi = arvud[0];
		for(int i = 1; i < arvud.length; i++){
			abi = abi * arvud[i];}
		return Math.pow(abi, 1.0/arvud.length);		
		
		/*double abi=1;
		for(double a: arvud){abi*=a;}
		return Math.pow(abi, 1.0/arvud.length);*/
	}
	/*public static void main(String[] arg){
        System.out.println(geomKeskmine(new double[]{4, 9}));
    }*/

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
    public static int yhisteJagajateKorrutis(ArrayList<Integer> tegurid){
		int puhver = 1;
        for(int arv: tegurid){
            puhver = puhver * arv;
        }        
        return puhver; 
    }
    public static int SYT(int arv1, int arv2){
        return yhisteJagajateKorrutis(yhisedJagajad(arv1, arv2));
    }	
}