abstract class AudioManager {
    AudioCodec audioCodec;

    AudioManager(AudioCodec audioCodec) {
        this.audioCodec = audioCodec;
    }

    abstract void play(String fileName);
}

