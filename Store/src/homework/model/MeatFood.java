package homework.model;

public class MeatFood extends Food {
    private String typeOfMeat;

    public MeatFood(String name, double price, long barcode, boolean isKosher, String expirationDate, String typeOfMeat) {
        super(name, price, barcode, isKosher, expirationDate);
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public String toString() {
        return super.toString() + "Meat type: " + typeOfMeat;
    }
}
