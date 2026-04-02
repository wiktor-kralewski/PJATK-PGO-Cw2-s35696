public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, String numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerKarty() {
        return numerKarty;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void wypiszDane(){
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " NumerKarty: " + numerKarty + " LiczbaWypozyczen: " + liczbaWypozyczen);

    }

    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }

    public void zmniejszLiczbeWypozyczen() {
        if(liczbaWypozyczen <= 0){
            return;
        }
        liczbaWypozyczen--;
    }

}
