
class USBWriterAdapter implements DataWriter {
    private USBWriter usbWriter;

    public USBWriterAdapter(USBWriter usbWriter) {
        this.usbWriter = usbWriter;
    }

    @Override
    public void writeData() {
        usbWriter.writeUSB();
    }
}
