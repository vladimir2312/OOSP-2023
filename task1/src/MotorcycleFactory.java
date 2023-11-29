public class MotorcycleFactory implements TransportFactory {
    @Override
    public Transport createTransport(String model, int year) {
        return new Motorcycle(model, year);
    }
}
