public class Main {
    public static void main(String[] args) {
        MeineKlasse obj = new MeineKlasse();
        int result = obj.add(2, 3);
        System.out.println("Ergebnis von 2 + 3 = " + result);

        if(result == 5) {
            System.out.println("Test erfolgreich!");
        } else {
            System.out.println("Test fehlgeschlagen!");
            System.exit(1); // CI schlägt fehl
        }
    }
}