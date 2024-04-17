package pl.comarch.szkolenia.abstrakcja;

public class ConnectorX implements SimpleInterface {
    @Override
    public void connect() {
        System.out.println("Lacze sie z X");
    }

    @Override
    public void disconnect() {
        System.out.println("Rozlaczam sie z X");
    }
}
