public class Proov3Kuvamine{
	public static void kuva(Arvutatav a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] arg){
		Arvutatav[] ad=new Arvutatav[5];
		ad[0]=new RingiPindala();
		ad[1]=new RistkylikuPindala(3);
        	ad[2]=new RistkylikuPindala(8);
		ad[3]=new RistkylikuPindala(5);
		ad[4]=new RisttahukaRuumala(1,2);
		for(int i=0; i<ad.length; i++){
			kuva(ad[i]);
		}
	}
}

/*
3.141592653589793 12.566370614359172 28.274333882308138 50.26548245743669 78.53981633974483
3.0 6.0 9.0 12.0 15.0
8.0 16.0 24.0 32.0 40.0
5.0 10.0 15.0 20.0 25.0
2.0 4.0 6.0 8.0 10.0
*/
