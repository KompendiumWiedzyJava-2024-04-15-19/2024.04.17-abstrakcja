package pl.comarch.szkolenia.abstrakcja;

public abstract class Algorytm {
    public void policz() {
        loadData();
        firstStepCalc();
        secondStepCalc();
        thirdStepCalc();
        saveResults();
    }

    public abstract void loadData();
    private void firstStepCalc() {
        System.out.println("1 krok liczenia");
    }
    private void secondStepCalc() {
        System.out.println("2 krok liczenia");
    }
    private void thirdStepCalc() {
        System.out.println("3 krok liczenia");
    }
    public abstract void saveResults();
}
