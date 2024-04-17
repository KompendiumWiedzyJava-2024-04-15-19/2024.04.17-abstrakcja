package pl.comarch.szkolenia.abstrakcja;

public class Algorytm2 {
    public void policz() {
        loadData();
        firstStepCalc();
        secondStepCalc();
        thirdStepCalc();
        saveResults();
    }

    private void loadData() {
        System.out.println("Wczytuje z pliku !!");
    }
    private void firstStepCalc() {
        System.out.println("1 krok liczenia");
    }
    private void secondStepCalc() {
        System.out.println("2 krok liczenia");
    }
    private void thirdStepCalc() {
        System.out.println("3 krok liczenia");
    }
    private void saveResults() {
        System.out.println("zapisuje dane w pliku !!");
    }
}
