public class BicycleFactory implements TransportFactory {
    @Override
    public Transport createTransport(String model, int year) {
        return new Bicycle(model, year);
    }
}
