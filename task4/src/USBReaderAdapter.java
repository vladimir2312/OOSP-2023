
class USBReaderAdapter implements DataReader {
    private USBReader usbReader;

    public USBReaderAdapter(USBReader usbReader) {
        this.usbReader = usbReader;
    }

    @Override
    public void readData() {
        usbReader.readUSB();
    }
}
