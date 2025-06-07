package telran.homework.model;

public class Types {
    private Byte byteType;
    private Integer integerType;
    private Short shortType;
    private Long longType;
    private Character characterType;
    private Float floatType;
    private Double doubleType;
    private Boolean booleanType;



    public Byte getByteType() {
        return byteType;
    }

    public void setByteType(Byte byteType) {
        this.byteType = byteType;
    }

    public Integer getIntegerType() {
        return integerType;
    }

    public void setIntegerType(Integer integerType) {
        this.integerType = integerType;
    }

    public Short getShortType() {
        return shortType;
    }

    public void setShortType(Short shortType) {
        this.shortType = shortType;
    }

    public Long getLongType() {
        return longType;
    }

    public void setLongType(Long longType) {
        this.longType = longType;
    }

    public Character getCharacterType() {
        return characterType;
    }

    public void setCharacterType(Character characterType) {
        this.characterType = characterType;
    }

    public Float getFloatType() {
        return floatType;
    }

    public void setFloatType(Float floatType) {
        this.floatType = floatType;
    }

    public Double getDoubleType() {
        return doubleType;
    }

    public void setDoubleType(Double doubleType) {
        this.doubleType = doubleType;
    }

    public Boolean getBooleanType() {
        return booleanType;
    }

    public void setBooleanType(Boolean booleanType) {
        this.booleanType = booleanType;
    }

    @Override
    public String toString() {
        return "Byte type = " +byteType + " integer Type = " + integerType + " shortType = " + shortType + " long Type = " + longType + " character Type = " + characterType + " float Type = " + floatType + " double Type = " + doubleType + "Boolean Type = " + booleanType;
    }

    public void printMaxValuesOfTypes(String typename) {
        switch (typename) {
            case "byte":
                System.out.println("Max value for byte is " + Byte.MAX_VALUE);
                break;
            case "int":
                System.out.println("Max value for int is " + Integer.MAX_VALUE);
                break;
            case "short":
                System.out.println("Max value for short is " + Short.MAX_VALUE);
                break;
            case "long":
                System.out.println("Max value for long is " + Long.MAX_VALUE);
                break;
            case "char":
                System.out.println("Max value for char is " + Character.MAX_VALUE);
                break;
            case "float":
                System.out.println("Max value for float is " + Float.MAX_VALUE);
                break;
            case "double":
                System.out.println("Max value for double is " + Double.MAX_VALUE);
                break;
            case "boolean":
                System.out.println("Max value for boolean is " + Boolean.TRUE);
                break;
            case "":
                System.out.println("Max value for byte is " + Byte.MAX_VALUE);
                System.out.println("Max value for int is " + Integer.MAX_VALUE);
                System.out.println("Max value for short is " + Short.MAX_VALUE);
                System.out.println("Max value for long is " + Long.MAX_VALUE);
                System.out.println("Max value for char is " + Character.MAX_VALUE);
                System.out.println("Max value for float is " + Float.MAX_VALUE);
                System.out.println("Max value for double is " + Double.MAX_VALUE);
                System.out.println("Max value for boolean is " + Boolean.TRUE);
                break;
            default:
                System.out.println(typename + " is a wrong type");
        }
    }

    public void printMinValuesOfTypes(String typename) {
        switch (typename) {
            case "byte":
                System.out.println("Min value for byte is " + Byte.MIN_VALUE);
                break;
            case "int":
                System.out.println("Min value for int is " + Integer.MIN_VALUE);
                break;
            case "short":
                System.out.println("Min value for short is " + Short.MIN_VALUE);
                break;
            case "long":
                System.out.println("Min value for long is " + Long.MIN_VALUE);
                break;
            case "char":
                System.out.println("Min value for char is " + Character.MIN_VALUE);
                break;
            case "float":
                System.out.println("Min value for float is " + Float.MIN_VALUE);
                break;
            case "double":
                System.out.println("Min value for double is " + Double.MIN_VALUE);
                break;
            case "boolean":
                System.out.println("Min value for boolean is " + Boolean.FALSE);
                break;
            case "":
                System.out.println("Min value for byte is " + Byte.MIN_VALUE);
                System.out.println("Min value for int is " + Integer.MIN_VALUE);
                System.out.println("Min value for short is " + Short.MIN_VALUE);
                System.out.println("Min value for long is " + Long.MIN_VALUE);
                System.out.println("Min value for char is " + Character.MIN_VALUE);
                System.out.println("Min value for float is " + Float.MIN_VALUE);
                System.out.println("Min value for double is " + Double.MIN_VALUE);
                System.out.println("Min value for boolean is " + Boolean.FALSE);
                break;
            default:
                System.out.println(typename + " Is a wrong type");
        }
    }

}
