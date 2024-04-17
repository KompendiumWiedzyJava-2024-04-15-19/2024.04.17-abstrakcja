package pl.comarch.szkolenia.abstrakcja;

public class AlgorytmDoPlikow extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("Laduje dane z pliku");
    }

    @Override
    public void saveResults() {
        System.out.println("zapisuje dane do pliku");
    }
}
