package pl.sternik.mj.sklep;

public interface Streamable extends Downloadable {
    public byte[] nextPacket();
}
