import java.io.*; //tüüpiline pack input output asjade juures
public class Kirjutamine1{
    public static void main(String[] arg) throws Exception{ //throws E. - viksab veateate kui ei saa faili kirjutada, arg lihtsalt muutujanimi vt hello world näidet
        PrintWriter pw1 = new PrintWriter("Vastus1.txt");  //printwriter on faili kirjutaja
       
        pw1.println(5*5);
        pw1.close();
        //käsk - more Vastus1.txt tulemus - 25, ls - nt kas fail tekkis

        //kirjuta faili arvude ruudud ühest kümneni
        PrintWriter pw2  = new PrintWriter("vastus2.txt");
        for(int i = 1; i<21; i++){
            pw2.println(i*i);
           
        }
        pw2.close();
    } 
}