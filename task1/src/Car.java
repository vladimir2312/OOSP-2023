public class Car extends Transport {
    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println("Машина модели: " + model + " выпущенная в " + year);
    }
}

