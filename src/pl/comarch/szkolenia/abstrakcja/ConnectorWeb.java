package pl.comarch.szkolenia.abstrakcja;

public class ConnectorWeb implements SimpleInterface {
    @Override
    public void connect() {
        System.out.println("Lacze sie z webem !!");
    }

    @Override
    public void disconnect() {
        System.out.println("Rozlaczam sie z webem !!");
    }
}
