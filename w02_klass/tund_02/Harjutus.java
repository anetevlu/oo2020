/*klass ristkülikukujulise akvaariumu tarbeks; 
väljad - pikkus, laius ja kõrgus cm ja vee hulk - ml
- käsklus küsimaks mitme cm kiht vett on akvaariumis
- käsklus akvaariumile etteantud milliliitrite jagu vee lisamiseks KATSETA
- kui veekogus ületab mahtu siis hoiatus
kood kahes failis - 1. akvaarium, 2. proovikäsud
- peaprog. mitme akvaariumiga
- akvaariumitest massiiv
- funk mitu l vett on akvaariumimassiivis kokku
 1 ml = 1 cm3
*/

public class Harjutus{
    int x = 1; //laius
    int y = 1; //kõrgus
    int z = 1; //pikkus
    double veehulk = 0; //veehulk ml
    double ruumala = x*y*z;

    public Harjutus(int ux,int uy,int uz, double vh){
        x = ux;
        y = uy;
        z = uz;
        veehulk = vh; //ml 
    }  

    public double akvaariumiV(){
       double ruumala = x*y*z;
       return ruumala; //kuupcm
    }

    public int kysiKorgus(){
        return y;
    }

    public double veeKorgus(){
        double veehulk = veehulk/(x*y);
        return veehulk;
    }

    public void lisaVett(double cm3){
        double veehulkUus = veehulk +cm3;
        return veehulkUus;        
    }

   
    
   /* public String kasVettMahubVeel(){
        if(veehulk > y) {
            return System.out.println("Nii palju vett ei mahu!");;
        } else {
        return System.out.println("Vett mahub veel!");
        }
    }*/
    


}