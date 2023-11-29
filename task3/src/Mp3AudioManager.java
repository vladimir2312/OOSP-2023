
class Mp3AudioManager extends AudioManager {
    Mp3AudioManager(AudioCodec audioCodec) {
        super(audioCodec);
    }

    void play(String fileName) {
        audioCodec.decode(fileName);
        System.out.println("Воспроизводим MP3 файл " + fileName);
    }
}
