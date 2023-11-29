
class Bot extends Player {
    @Override
    void initialize() {
        System.out.println("Инициализация бота");
    }

    @Override
    void startGame() {
        System.out.println("Бот начинает игру");
    }

    @Override
    void endGame() {
        System.out.println("Бот закончил игру");
    }
}
