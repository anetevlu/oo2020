import org.junit.*;
import static org.junit.Assert.*;

public class Kontroll1{
	@Test
	public void esimene(){
		System.out.println("Testi automaatkäivitus");
	}
	@Test
	public void arvutus1(){
	   assertEquals(6, Abifunktsioonid.geomKeskmine(new double[]{4, 9}), 0.001);
	}
	@Test
	public void arvutus2(){
	   assertEquals(3, Abifunktsioonid.geomKeskmine(new double[]{1, 3, 9}), 0.001);
	}

	@Test
	public void arvutus3(){
		assertEquals(2, Abifunktsioonid.geomKeskmine(new double[]{1, 1, 1, 4, 8}), 0.001);
	}

	@Test
    public void arvutussyt(){
    assertEquals(3, Abifunktsioonid.SYT(9, 6), 0.001);
    }
}

/*
JUnit version 4.8.2
.Testi automaatkäivitus
....
Time: 0.029

OK (5 tests)

*/