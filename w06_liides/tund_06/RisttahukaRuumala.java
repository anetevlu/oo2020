public class RisttahukaRuumala implements Arvutatav{
    double laius;
    double pikkus;

	public RisttahukaRuumala(double uusLaius, double uusPikkus){
        laius = uusLaius;
        pikkus = uusPikkus;
    }
    
	public double f(double korgus){
		return pikkus*laius*korgus;
	}
}