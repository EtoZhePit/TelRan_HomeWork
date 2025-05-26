package homework.model;

public class Food extends Product {
    private boolean isKosher;
    private String expirationDate;

    public Food(String name, double price, long barcode, boolean isKosher, String expirationDate) {
        super(name, price, barcode);
        this.isKosher = isKosher;
        this.expirationDate = expirationDate;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public void setKosher(boolean kosher) {
        isKosher = kosher;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " Is Kosher: " + isKosher + ", Expiration Date: " + expirationDate;
    }
}
