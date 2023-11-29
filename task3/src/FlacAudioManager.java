
class FlacAudioManager extends AudioManager {
    FlacAudioManager(AudioCodec audioCodec) {
        super(audioCodec);
    }

    void play(String fileName) {
        audioCodec.decode(fileName);
        System.out.println("Воспроизводим FLAC файл " + fileName);
    }
}
