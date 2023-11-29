
public class Main {
    public static void main(String[] args) {
        Player realPlayer = new RealPlayer();
        Player bot = new Bot();
        Player npc = new NPC();

        realPlayer.play();
        System.out.println("------");
        bot.play();
        System.out.println("------");
        npc.play();
    }
}//вариант 12
//Реализуйте систему для управления разными видами игроков в онлайн-игре (игроки, боты, NPC), где разные виды игроков используют общий шаблонный метод для обновления и взаимодействия.
