public class Bank{
    private Bank() {}
    public static Operacje getBankier(String bankier, int srodki) {
        switch (bankier) {
            case "Bankier1":
                return new Bankier1(srodki);
            case "Bankier2":
                return new Bankier2(srodki);
            default:
                return null;
        }
    }
}
