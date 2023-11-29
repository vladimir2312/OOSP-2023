
public class Main {
    public static void main(String[] args) {
        DataReader usbReader = new USBReaderAdapter(new USBReader());
        usbReader.readData();

        DataWriter usbWriter = new USBWriterAdapter(new USBWriter());
        usbWriter.writeData();

        DataReader sdReader = new SDReaderAdapter(new SDReader());
        sdReader.readData();

        DataWriter sdWriter = new SDWriterAdapter(new SDWriter());
        sdWriter.writeData();
    }
}// вариант 7
//Создайте приложение для чтения и записи данных на различные типы внешних устройств хранения (USB-накопители, SD-карты) с использованием адаптеров.