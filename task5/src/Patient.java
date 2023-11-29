public class Patient implements Observer {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ", у вас новые результаты анализов: " + message);
    }
}
