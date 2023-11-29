public class CarFactory implements TransportFactory {
    @Override
    public Transport createTransport(String model, int year) {
        return new Car(model, year);
    }
}
