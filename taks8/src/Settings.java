public class Settings {
    private String state;

    public Memento save() {
        return new SettingsMemento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private static class SettingsMemento implements Memento {
        private final String state;

        private SettingsMemento(String state) {
            this.state = state;
        }

        @Override
        public void setState(String state) {
            throw new UnsupportedOperationException();
        }

        @Override
        public String getState() {
            return state;
        }
    }
}
