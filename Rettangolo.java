public class Rettangolo implements Forma{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza, tipo tipo) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + base*altezza);
    }
}
