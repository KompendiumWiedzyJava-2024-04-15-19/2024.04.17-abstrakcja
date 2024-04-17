package pl.comarch.szkolenia.abstrakcja;

public abstract class KlasaAbstrakcyjna {
    int a;
    int z;
    String x;

    public KlasaAbstrakcyjna(int a, int z, String x) {
        this.a = a;
        this.z = z;
        this.x = x;
    }

    public KlasaAbstrakcyjna() {
    }

    public void cos() {
        //
    }

    private void prywatna() {
        //??
        //??
    }

    public abstract void metodaAbstrakcyjna();
}
