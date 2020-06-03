import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

public class Testid{

    @Test
    public void nimetusekirjutamine() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("toit.txt"));
        String rida = br.readLine();

        assertEquals("Tomati-hapukooresalat", rida); 
    }

} 

/*
JUnit version 4.8.2
.
Time: 0.005

OK (1 test)


*/