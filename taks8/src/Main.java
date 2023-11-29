
public class Main {
    public static void main(String[] args) {

        GameSettingsManager settingsManager = new GameSettingsManager();


        Settings settings = new Settings();


        settings.setState("Настройки по умолчанию");

        settingsManager.saveSettings(settings);

        settings.setState("Измененные настройки");

        settingsManager.restoreSettings(settings);

        System.out.println(settings.getState());
    }
}//вариант 5
//Разработайте систему управления настройками игры, позволяющую сохранять и восстанавливать настройки игрока.