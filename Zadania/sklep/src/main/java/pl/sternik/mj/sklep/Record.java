package pl.sternik.mj.sklep;

import java.io.File;



public class Record extends Article implements Streamable {

    private long fileSize;
    private String fileFormat;
    @Override
    public byte[] nextPacket() {
        return new byte[0];
    }

    @Override
    public long fileSize() {
        return fileSize;
    }

    @Override
    public String fileFormat() {
        return fileFormat;
    }

    public Record(int idNumber, String productName, String productDescription, float productPrice, long fileSize, String fileFormat) {
        super(productName, productPrice, productDescription);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public Record(long fileSize, String fileFormat) {
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }
}
