public class Motorcycle extends Transport {
    public Motorcycle(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println("Мотоцикл модели: " + model + " выпущенный в " + year);
    }
}
