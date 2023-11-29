import java.util.ArrayDeque;
import java.util.Deque;

public class GameSettingsManager {
    private final Deque<Memento> mementos = new ArrayDeque<>();


    public void saveSettings(Settings settings) {
        mementos.push(settings.save());
    }

    public void restoreSettings(Settings settings) {
        if (!mementos.isEmpty()) {
            settings.restore(mementos.pop());
        }
    }
}
