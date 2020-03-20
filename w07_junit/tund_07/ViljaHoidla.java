public class ViljaHoidla implements Hoidla{
    int kogus = 0;
    public void lisa(int lisakogus){
        kogus += lisakogus;
    }
	
    public int kysi(){
        return kogus;
    }
}