
class SDReaderAdapter implements DataReader {
    private SDReader sdReader;

    public SDReaderAdapter(SDReader sdReader) {
        this.sdReader = sdReader;
    }

    @Override
    public void readData() {
        sdReader.readSD();
    }
}
