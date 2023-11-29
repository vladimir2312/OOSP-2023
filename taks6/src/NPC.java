
class NPC extends Player {
    @Override
    void initialize() {
        System.out.println("Инициализация NPC");
    }

    @Override
    void startGame() {
        System.out.println("NPC начинает игру");
    }

    @Override
    void endGame() {
        System.out.println("NPC закончил игру");
    }
}
