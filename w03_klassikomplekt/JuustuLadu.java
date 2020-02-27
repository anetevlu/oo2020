public class JuustuLadu{
    int laokogus;
    Pood poekogus;
    
        public JuustuLadu(int ukogus, Pood upoekogus){
            laokogus = ukogus;
            poekogus = upoekogus;
        }

        public int kysiLaoKogus(){
            return laokogus;
        }

        public boolean kasPoodiVaja(){
            if(poekogus.kysiPoeKogus()>0){
                return false;
            } else {
                return true;
            }
        }
    
}