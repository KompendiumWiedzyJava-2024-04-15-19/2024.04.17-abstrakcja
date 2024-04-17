package pl.comarch.szkolenia.abstrakcja;

public class ConnectorDB implements SimpleInterface {
    @Override
    public void connect() {
        System.out.println("Lacze sie z baza danych !!");
    }

    @Override
    public void disconnect() {
        System.out.println("Rozlaczam sie z baza danych !!");
    }
}
