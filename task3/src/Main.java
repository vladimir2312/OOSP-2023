
public class Main {
    public static void main(String[] args) {

        AudioCodec mp3Codec = new Mp3Codec();
        AudioCodec aacCodec = new AacCodec();
        AudioCodec flacCodec = new FlacCodec();


        AudioManager mp3AudioManager = new Mp3AudioManager(mp3Codec);
        AudioManager aacAudioManager = new AacAudioManager(aacCodec);
        AudioManager flacAudioManager = new FlacAudioManager(flacCodec);


        mp3AudioManager.play("audio.mp3");
        aacAudioManager.play("audio.aac");
        flacAudioManager.play("audio.flac");
    }
}//Вариант 14
//Разработайте систему для управления разными видами аудио-кодеков (MP3, AAC, FLAC) с использованием паттерна "мост".