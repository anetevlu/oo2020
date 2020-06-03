import java.io.*;

public class LugemineToit{
    public static void main(String[] arg) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("toit.txt"));
        String rida = br.readLine();
        while(rida != null){
            System.out.println(rida);
            rida = br.readLine();
        }
        br.close();
    }
}