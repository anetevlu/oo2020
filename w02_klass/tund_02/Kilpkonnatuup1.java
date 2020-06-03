public class Kilpkonnatuup1{
    int x = 1;
    int y = 1;
    String suund;
   

    //klassiga samanimeline funktsioon = konstruktor
    public Kilpkonnatuup1(int ux, int uy, String usuund){
        x = ux;
        y = uy;
        suund = usuund;
        if(!kasAsukohtOK()){ //this - iseendale viitamiseks
            System.out.println("sobimatu asukoht "+this.toString());
            //throw new RuntimeException("Asukoht ei sobi" +this);
        }
    }

    public String toString(){
        return "(" + x + ", " + y + ", " + suund + ")";
    }
    public boolean kasAsukohtOK(){
        if(x<1){return false;}
        if(y<1){return false;}
        if(x>4){return false;}
        if(y>4){return false;}
        return true;        
    }
    public int kysix() {return x;}
    public int kysiy() {return y;}

    public void edasi(){
        if(suund.equals("ida")) {x++;} //paremale
        if(suund.equals("lõuna")) {y++;} //alla
        if(suund.equals("lääs")) {x--;} //vasakule
        if(suund.equals("põhi")) {y--;} //üles
    }
    
    public void paremale(){
        if(suund.equals("ida")){suund = "lõuna";}
        else if(suund.equals("lõuna")) {suund = "lääs";}
        else if(suund.equals("lääs")) {suund = "põhi";}
        else {suund = "ida";}
    }
}
