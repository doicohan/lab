package entity;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {

        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);

        if (!isValidTriangle(this.sideA, this.sideB, this.sideC)) {
            throw new IllegalArgumentException(
                "Sum of any two sides must be greater than the remaining side"
            );
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        this.sideC = sideC;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c &&
               a + c > b &&
               b + c > a;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA)
                           * (p - sideB)
                           * (p - sideC));
    }

    @Override
    public void printResult() {
        System.out.println("Triangle:");
        System.out.println("Side A = " + sideA);
        System.out.println("Side B = " + sideB);
        System.out.println("Side C = " + sideC);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }
}
