public class Abifunktsioonid{
	public static double geomKeskmine(double[] arvud){		
		double abi=1;
		for(double a: arvud){abi*=a;}
		return Math.pow(abi, 1.0/arvud.length);
	}
	public static void main(String[] arg){
        System.out.println(geomKeskmine(new double[]{4, 9}));
    }
}