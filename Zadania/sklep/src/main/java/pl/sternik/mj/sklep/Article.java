package pl.sternik.mj.sklep;


import org.apache.log4j.Logger;

public class Article {
    private static int counter;
    private int idNumber;
    private String productName;
    private float productPrice;
    private String productDescription;

    public Article() {
        counter++;
    }

    public Article(String productName, float productPrice, String productDescription) {

        this.idNumber = counter;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        counter++;
    }

    @Override
    public String toString() {
        return "Article{" +
                "idNumber=" + idNumber +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }

    private static final Logger log = Logger.getLogger("Article");

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        printChange();
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }



    public static int getCounter() {
        return counter;
    }

    private void printChange() {
        log.debug("Zmieniono wartość pola");
    }




}
