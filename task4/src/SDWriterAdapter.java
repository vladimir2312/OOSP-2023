
class SDWriterAdapter implements DataWriter {
    private SDWriter sdWriter;

    public SDWriterAdapter(SDWriter sdWriter) {
        this.sdWriter = sdWriter;
    }

    @Override
    public void writeData() {
        sdWriter.writeSD();
    }
}
