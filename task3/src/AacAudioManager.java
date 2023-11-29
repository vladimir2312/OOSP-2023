// Конкретная реализация управления аудио-кодеком AAC
class AacAudioManager extends AudioManager {
    AacAudioManager(AudioCodec audioCodec) {
        super(audioCodec);
    }

    void play(String fileName) {
        audioCodec.decode(fileName);
        System.out.println("Воспроизводим AAC файл " + fileName);
    }
}
