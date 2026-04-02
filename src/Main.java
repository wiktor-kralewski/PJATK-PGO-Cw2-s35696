public class Main {
    public static void main(String[] args) {

        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", "XYZ", 150, true);
        Ksiazka ksiazka2 = new Ksiazka("Wiedźmin2", "XYZ", 100, true);
        Ksiazka ksiazka3 = new Ksiazka("Wiedźmin3", "XYZ", 160, true);
        Ksiazka ksiazka4 = new Ksiazka("Wiedźmin4", "XYZ", 150, true);

        ksiazka1.wypiszInfo();
        ksiazka1.wypozycz();
        ksiazka1.wypiszInfo();
        ksiazka1.zwroc();
        ksiazka1.wypiszInfo();
    }
}
