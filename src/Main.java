public class Main {
    public static void main(String[] args) {
        Operacje bankier1 = Bank.getBankier("Bankier1",10000);
        Operacje bankier2 = Bank.getBankier("Bankier2",100);


        bankier1.srodkiBankiera();
        bankier1.wplac(100);
        bankier1.wyplac(10000);
        bankier1.srodkiBankiera();
        bankier1.wyplac(200);
    }
}