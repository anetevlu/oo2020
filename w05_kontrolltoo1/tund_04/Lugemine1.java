import java.io.*;
public class Lugemine1{
    public static void main(String[] arg) throws Exception{
        BufferedReader br1 = new BufferedReader(new FileReader("ykssis.txt"));
        String rida = br1.readLine();
        String[] m1 = rida.split(" ");
        int olemas = Integer.parseInt(m1[0]);
        int nadalas = Integer.parseInt(m1[1]);
        int adalbertKokku = olemas + 10*nadalas;
        int suurim = adalbertKokku;
        //tsükli abil teiste andmete lugemine, jäta meelde suurim 
        //faili üksval.txt kirjutage, mitu leiutist peab adalbert juurde tellima et võita
        for(int i = 2; i<6; i++){
            m1 = br1.readLine().split(" ");
            olemas = Integer.parseInt(m1[0]);
            nadalas = Integer.parseInt(m1[1]);            
            int arvutus = olemas + 10*nadalas;
            if(arvutus > suurim){
                suurim = arvutus;
            }
        }


        br1.close();
        PrintWriter pw1 = new PrintWriter("yksval.txt");
        pw1.println((suurim >= adalbertKokku)?(suurim-adalbertKokku+1):0);//mis see on?
        pw1.close();

    }
}