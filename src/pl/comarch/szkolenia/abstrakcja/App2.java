package pl.comarch.szkolenia.abstrakcja;

public class App2 {
    public static void main(String[] args) {
        /*Algorytm algorytm = new Algorytm();
        algorytm.policz();

        Algorytm2 algorytm2 = new Algorytm2();
        algorytm2.policz();*/

        Algorytm algorytm = new AlgorytmDoBazyDanych();
        algorytm.policz();

        Algorytm algorytm2 = new AlgorytmDoPlikow();
        algorytm2.policz();
    }
}
