public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int wielkosc) {
        this.ksiazki = new Ksiazka[wielkosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek++] = ksiazka;
        }else {
            System.out.println("Brak miejsca w bibliotece");
        }
    }

    public void wypiszDostepneKsiazki() {
        for(int i = 0; i < liczbaKsiazek; i++){
            Ksiazka ksiazka = ksiazki[i];
            if(ksiazka.isCzyDostepna()) {
                ksiazka.wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul){
        for(int i = 0; i < liczbaKsiazek; i++) {
            Ksiazka ksiazka = ksiazki[i];
            if(ksiazka.getTytul().equalsIgnoreCase(tytul)) {
                return ksiazka;
            }
        }
        System.out.println("Książka o tytule: " + tytul + " nie została odnalezniona w bibliotece.");
        return null;
    }

    public int zwrocLiczbeDostepnychKsiazek(){
        int liczbaDostepnychKsiazek = 0;
        for(int i = 0; i < liczbaKsiazek; i++) {
            Ksiazka ksiazka = ksiazki[i];
            if(ksiazka.isCzyDostepna()) {
                liczbaDostepnychKsiazek++;
            }
        }
        return liczbaDostepnychKsiazek;
    }

}

