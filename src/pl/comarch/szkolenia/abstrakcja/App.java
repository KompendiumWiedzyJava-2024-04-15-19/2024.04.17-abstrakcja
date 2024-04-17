package pl.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        ConnectorDB connectorDB = new ConnectorDB();
        connectorDB.connect();
        connectorDB.disconnect();

        ConnectorWeb connectorWeb = new ConnectorWeb();
        connectorWeb.connect();
        connectorWeb.disconnect();

        ConnectorX connectorX = new ConnectorX();
        connectorX.connect();
        connectorX.disconnect();

        SimpleInterface[] tab = new SimpleInterface[3];
        tab[0] = new ConnectorDB();
        tab[1] = new ConnectorWeb();
        tab[2] = new ConnectorX();

        /*SimpleInterface simpleInterface = new SimpleInterface();
        simpleInterface.connect();*/

        SimpleInterface x = new ConnectorX();
        x.connect();
        ///
        //
        //
        x.disconnect();
    }
}
