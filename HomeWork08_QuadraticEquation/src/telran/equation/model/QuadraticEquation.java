package telran.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void display() { //вывод
        //ToDO ax^2+bx+c=0
        System.out.println("ax^2+bx+c=0 = " + a + "x^2+" + b + "x+" + c);

    }
    public double delta() { // вычисление дельты
    // ToDo D = b^2-4ac
        double del = b * b - 4 * a * c;

        return del;
    }
    public double quantityRoots(){ // сколько всего корней. Если дельта полож. то 2, если = 0, то 1, если < 0, то 0
        //toDO if delta < 0 -> 0 roots
        double rootNum = 0;

        if (delta() > 0) {
            rootNum = 2;
        } else if (delta() == 0) {
            rootNum = 1;
        }
        return rootNum;
    }
    public double[] getRoots(){
        //todo if delta > 0 -> 2 roots
        double[] roots = new double[2];
        double d = delta();

        if (delta() > 0) {
            roots[0] = (-b + Math.sqrt(d))/(2*a);
            roots[1] = (-b - Math.sqrt(d))/(2*a);
            return roots;
        }
        if (delta() == 0) {
            roots[0] = (-b + Math.sqrt(d))/(2*a);
            return roots;
        }
        if (delta() < 0) {
            return roots;
        }
        return roots;

    }

}
