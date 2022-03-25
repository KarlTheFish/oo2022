package Kujundid;

public class Kolmnurk implements Kujund{
    double kylg1;
    double kylg2;
    double kylg3;

    public Kolmnurk(double kylg1, double kylg2, double kylg3) {
        this.kylg1 = kylg1;
        this.kylg2 = kylg2;
        this.kylg3 = kylg3;
    }

    @Override
    public double ymbermoot() {
        return kylg1 + kylg2 + kylg3;
    }

    @Override
    public double pindala() {
        return Math.sqrt(((0.5 * ymbermoot()) - kylg1) + ((0.5 * ymbermoot()) - kylg2) + ((0.5 * ymbermoot()) - kylg3));
    }
}
