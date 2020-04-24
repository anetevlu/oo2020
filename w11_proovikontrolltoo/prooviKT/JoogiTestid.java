import org.junit.*;
import static org.junit.Assert.*;
public class JoogiTestid{
    
    
    @Test
    public void nimetus(){
        Jook jook = new Jook("limonaad", 0.2, 1.1);
        assertEquals("limonaad", jook.kysiNimetus());
    }

    @Test
    public void mass(){
        Jook jook1 = new Jook("limonaad", 0.7, 1.05);
        Joogipudel pudel1 = new Joogipudel(jook1, 0.5, 0, 0.2, 0.1);
        assertEquals(0.725, pudel1.kysiMass(), 0.01);
    }

    @Test
    public void hind1(){
        Jook jook1 = new Jook("piim", 0.28, 1.05);
        Joogipudel pudel1 = new Joogipudel(jook1, 0.5, 0, 0.2, 0.1);
        assertEquals(0.24, pudel1.omahind(), 0.01);
    }

    @Test 
    public void vaat1(){
        Joogivaat v1=new Joogivaat(new Jook("limonaad", 0.2, 1.1), 50, 15);
        Joogipudel[] pd=new Joogipudel[10];
        for(int i=0; i<pd.length; i++){
            pd[i]=new Joogipudel(null, 1.5, 1, 0.07, 0.1);
        }
        for(int i=0; i<pd.length; i++){
            v1.taidaPudel(pd[i]);
        }
        assertEquals(0, v1.kysiTaidetud(), 0.01);
    }
}