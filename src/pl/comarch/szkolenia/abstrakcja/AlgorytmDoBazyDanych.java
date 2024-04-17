package pl.comarch.szkolenia.abstrakcja;

public class AlgorytmDoBazyDanych extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("Laduje dane z bazy");
    }

    @Override
    public void saveResults() {
        System.out.println("Zapisuje dane do bazy");
    }
}
