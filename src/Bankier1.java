public class Bankier1 implements Operacje{
    private int srodki = 0;
    Bankier1(int srodki)
    {
        this.srodki = srodki;
    }
    public void wyplac(int ile)
    {
        if (ile > srodki)
        {
            System.out.println("brak środków do wypłaty");
        }
        else
        {
            srodki-=ile;
            System.out.println("wyplacono "+ile);
        }
    }
    public void wplac(int ile)
    {
        srodki += ile;
        System.out.println("wplacono "+ile);
    }
    public void srodkiBankiera(){
        System.out.println("srodki bankiera "+srodki);
    }
}
