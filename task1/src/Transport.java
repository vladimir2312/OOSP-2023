public abstract class Transport {
    protected String model;
    protected int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void drive();
}