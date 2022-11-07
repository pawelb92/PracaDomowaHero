public class Hero{
    private String imie;
    private String klasa;
    private int sila;
    private int mana;
    private boolean noweStare;

    Hero(String imie, String klasa, int sila, int mana, boolean newOld){
        this.imie = imie;
        this.klasa = klasa;
        this.sila = sila;
        this.mana = mana;
        this.noweStare = noweStare;

    }
    public void changeName(String imie){
        this.imie = imie;
    }
    public String vievName(){
        return imie;
    }
    public void changeClass(String klasa){
        this.klasa = klasa;
    }
    public String vievClass(){
        return klasa;
    }
    public void changeForce(int sila){
        this.sila = sila;
    }
    public int vievForce(){
        return sila;
    }
    public void changeMana(int mana){
        this.mana = mana;
    }
    public int vievMana(){
        return mana;
    }
    public void changeNewOld(boolean noweStare){
        this.noweStare = noweStare;
    }
    public boolean vievNewOld(){
        return noweStare;
    }




}
