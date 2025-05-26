package homework.model;

public class MilkFood extends Food {
    private String typeOfMilk;
    private double fatPr;

    public MilkFood(String name, double price, long barcode, boolean isKosher, String expirationDate, String typeOfMilk, double fatPr) {
        super(name, price, barcode, isKosher, expirationDate);
        this.typeOfMilk = typeOfMilk;
        this.fatPr = fatPr;
    }

    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }

    public double getFatPr() {
        return fatPr;
    }

    public void setFatPr(double fatPr) {
        this.fatPr = fatPr;
    }
}
