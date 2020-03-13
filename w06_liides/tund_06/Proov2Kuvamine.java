public class Proov2Kuvamine{
	public static void kuva(Arvutatav a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] arg){
		kuva(new RistkylikuPindala(5));
		kuva(new RisttahukaRuumala(1,2));
	}
}

/*
5.0 10.0 15.0 20.0 25.0
2.0 4.0 6.0 8.0 10.0
*/
