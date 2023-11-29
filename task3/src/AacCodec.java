// Конкретная реализация аудио-кодека AAC
class AacCodec extends AudioCodec {
    void decode(String fileName) {
        System.out.println("Декодируем AAC файл " + fileName);
    }
}
