public class Main {
    public static void main(String[] args) {
        MeineKlasse obj1 = new MeineKlasse();
        MeineKlasse obj2 = new MeineKlasse();
        int result = obj1.add(2, 3);
        int result2 = obj2.add(4, 5);
        System.out.println("Ergebnis von 2 + 3 = " + result);
        System.out.println("Ergebnis von 4 + 5 = " + result2);

        if(result == 5) {
            System.out.println("Test erfolgreich!");
        } else {
            System.out.println("Test fehlgeschlagen!");
            System.exit(1); // CI schlägt fehl
        }

        if(result2 == 9){
            System.out.println("Test erfolgreich!");
        } else {
            System.out.println("Test fehlgeschlagen!");
            System.exit(1); // CI schlägt fehl
        }
    }
}