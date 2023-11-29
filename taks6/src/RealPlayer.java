class RealPlayer extends Player {
    @Override
    void initialize() {
        System.out.println("Инициализация реального игрока");
    }

    @Override
    void startGame() {
        System.out.println("Реальный игрок начинает игру");
    }

    @Override
    void endGame() {
        System.out.println("Реальный игрок закончил игру");
    }
}
