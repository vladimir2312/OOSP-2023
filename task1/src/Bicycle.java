public class Bicycle extends Transport {
    public Bicycle(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println("Велосипед модели: " + model + " выпещенный в " + year);
    }
}
