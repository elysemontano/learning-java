
public class Triangle {
    static int numOfSides = 3;
    double base;
    double height;
    double sideLength1;
    double sideLength2;
    double sideLength3;

    public Triangle(double base, double height, double sideLength1, double sideLength2, double sideLength3) {
        this.base = base;
        this.height = height;
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
