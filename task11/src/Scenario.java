import java.util.ArrayList;

class Scenario implements Cloneable {
    private ArrayList<String> steps;

    public Scenario() {
        steps = new ArrayList<>();
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void removeStep(String step) {
        steps.remove(step);
    }

    @Override
    public Scenario clone() throws CloneNotSupportedException {
        Scenario clone = (Scenario) super.clone();
        clone.steps = new ArrayList<>(steps);
        return clone;
    }

    @Override
    public String toString() {
        return "Сценарий{" +
                "шаг=" + steps +
                '}';
    }
}
