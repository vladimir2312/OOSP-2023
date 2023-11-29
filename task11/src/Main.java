public class Main {
    public static void main(String[] args) {
        Scenario initialScenario = new Scenario();
        initialScenario.addStep("шаг 1");
        initialScenario.addStep("шаг 2");

        ScenarioGenerator generator = new ScenarioGenerator();
        generator.addInitialScenarios(initialScenario);
        generator.generateScenarios(3);
        generator.printScenarios();
    }
}//вариант 9
//Реализуйте генератор на основании паттерна "Прототип" случайных сценариев для тестирования, который клонирует существующие сценарии для модификации.
