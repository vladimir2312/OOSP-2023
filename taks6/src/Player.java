
abstract class Player {

    public void play() {
        initialize();
        startGame();
        endGame();
    }
    abstract void initialize();
    abstract void startGame();
    abstract void endGame();
}
