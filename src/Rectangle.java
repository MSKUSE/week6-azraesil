
public class Rectangle extends Shape {
    private int sideA, sideB;
    public static int counter = 0;
    public int counterForObject;

    public Rectangle(Point location, int sideA, int sideB) {
        super(location);
        this.sideA = sideA;
        this.sideB = sideB;
        counter++;
        this.counterForObject = counter;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public int area() {
        return sideA * sideB;
    }

    @Override
    public int perimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", location=" + getLocation() +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
