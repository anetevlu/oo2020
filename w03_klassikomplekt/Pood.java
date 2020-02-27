public class Pood{
    int poekogus;
    int uuspoekogus;

    public Pood(int upoekogus){
        poekogus = upoekogus;
    }

    public int kysiPoeKogus(){
        return poekogus;
    }

    public int lahuta(int arv){
        uuspoekogus = poekogus - arv;
        return uuspoekogus;
    }
}