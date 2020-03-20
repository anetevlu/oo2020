import org.junit.*;
import static org.junit.Assert.*;
public class HoidlaTestid{
    Hoidla h;
    
    @Test
    public void lisamine1(){
        //h = new ViljaHoidla();
        h = new M2lugaHoidla();
        h.lisa(3);
        h.lisa(4);
        assertEquals(7, h.kysi());
    }

    @Test
    public void algusesTyhi(){
        //h = new ViljaHoidla();
        h = new M2lugaHoidla();
        assertEquals(0, h.kysi());
    }
}
/*
JUnit version 4.8.2
..
Time: 0.021

OK (2 tests)

*/
/* mäluga hoidla testid
JUnit version 4.8.2
..
Time: 0.015

OK (2 tests)

*/