import java.util.ArrayList;
import java.util.Scanner;

public class Main2{
    public static void main(String[] arg){
        
        //toidukomp - kogus, new toiduaine (nimetus, valk rasv süsi)  
        //algne kogus 20 + 90 + 120 = 250 g -> tahetakse nt 500 siis 500/240 saab kui palju juurde vaja ja korrutada iga toiduaine kaal
        Toidukomponent hapukoor = new Toidukomponent(90, new Toiduaine("hapukoor", 3, 20, 4)); 
        Toidukomponent tomat = new Toidukomponent(120, new Toiduaine("tomat", 1, 0.6, 4));
        Toidukomponent till = new Toidukomponent(20, new Toiduaine("till", 2, 0.9, 5));
        ArrayList<Toidukomponent> komponendid = new ArrayList<Toidukomponent>();
        komponendid.add(hapukoor);
        komponendid.add(tomat);
        komponendid.add(till);

        Toit salat = new Toit("salat", komponendid);

        System.out.println("Salatis on " + salat.toidusRasva() + "g rasva.");
        System.out.println("Salatis on " + salat.toidusValke() + "g valke.");
        System.out.println("Salatis on " + salat.toidusSysivesikuid() + "g süsivesikuid.");

        Scanner inPut = new Scanner(System.in);
        System.out.println("Kirjuta soovitud kogus (grammides): ");
        int sisKogus = Integer.parseInt(inPut.nextLine());
        double abi = sisKogus / salat.kogusKokku();
        System.out.println("Vaja on: " + tomat.kysiKogus()*abi + " grammi tomateid, " + hapukoor.kysiKogus()*abi + " grammi hapukoort, "
                    + till.kysiKogus()*abi + " grammi tilli.");
    }
}