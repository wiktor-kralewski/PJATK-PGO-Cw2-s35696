public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean czyDostepna;

    //KONSTRUKTOR
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean czyDostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.czyDostepna = czyDostepna;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public boolean isCzyDostepna() {
        return czyDostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytul: " + tytul + ", Autor: " + autor + ", LiczbaStron: " + liczbaStron + ", czyDostepna: " + czyDostepna);
    }

    public void wypozycz() {
        czyDostepna = false;
    }

    public void zwroc() {
        czyDostepna = true;
    }

}
