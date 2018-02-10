package pl.sternik.mj.sklep;

public abstract class Person {

    private String productName;
    static private int counter;

    public Person() {
        counter++;
    }

    public int getIdNumber() {
        return idNumber;
    }

    private int idNumber;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract boolean getAuthorization();

}
