import org.junit.*;
import static org.junit.Assert.*;
public class HoidlaTestid1{
    Hoidla h;

    @Before
    public void alustaTesti(){
        h = new ViljaHoidla();
    }

    @Test
    public void lisamine1(){
        h.lisa(3);
        h.lisa(4);
        assertEquals(7, h.kysi());
    }

    @Test
    public void algusesTyhi(){
        assertEquals(0, h.kysi());
    }

    @After
    public void testiLopetus(){
        System.out.println(h);
    }
}
/*
JUnit version 4.8.2
.ViljaHoidla@65b3120a
.ViljaHoidla@5e9f23b4

Time: 0.017

OK (2 tests)


*/