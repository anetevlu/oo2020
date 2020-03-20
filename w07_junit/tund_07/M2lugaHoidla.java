import java.util.*;
public class M2lugaHoidla implements Hoidla{
    List<Integer> puhver = new ArrayList<Integer>();

    public void lisa(int kogus){
        puhver.add(kogus);
    }

    public int kysi(){
        int summa = 0;
        for(int i = 0; i < puhver.size(); i++){
            summa += puhver.get(i);
        }
        return summa;
    }

    public String toString(){
		return "Hoidlas: "+puhver;
	}

}