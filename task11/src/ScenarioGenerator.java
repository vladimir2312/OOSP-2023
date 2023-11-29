import java.util.ArrayList;
import java.util.Random;

class ScenarioGenerator {
    private ArrayList<Scenario> scenarios;
    private Random random;

    public ScenarioGenerator() {
        scenarios = new ArrayList<>();
        random = new Random();
    }


    public void addInitialScenarios(Scenario scenario) {
        scenarios.add(scenario);
    }


    public void generateScenarios(int count) {
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(scenarios.size());
            try {
                Scenario newScenario = scenarios.get(index).clone();
                modifyScenario(newScenario);
                scenarios.add(newScenario);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }


    private void modifyScenario(Scenario scenario) {
        int stepsCount = random.nextInt(5) + 1;
        for (int i = 0; i < stepsCount; i++) {
            String step = "шаг " + i;
            scenario.addStep(step);
        }
    }

    public void printScenarios() {
        for (Scenario scenario : scenarios) {
            System.out.println(scenario);
        }
    }
}
