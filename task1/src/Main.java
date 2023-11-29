public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport("Toyota", 2016);
        car.drive();

        TransportFactory bicycleFactory = new BicycleFactory();
        Transport bicycle = bicycleFactory.createTransport("BMX", 2015);
        bicycle.drive();

        TransportFactory motorcycleFactory = new MotorcycleFactory();
        Transport motorcycle = motorcycleFactory.createTransport("Harley-Davidson", 2022);
        motorcycle.drive();

    }
}
/*
      4.Вариант
       Реализуйте систему управления различными видами транспортных средств (автомобили, велосипеды, мотоциклы) с использованием фабричного метода.
 */