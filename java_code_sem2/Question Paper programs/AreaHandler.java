abstract class Shape {
    abstract void RectangleArea(int l, int b);
    abstract void SquareArea(int a);
    abstract void CircleArea(int r);
}

class Area extends Shape {

    @Override
    void RectangleArea(int l, int b) {
        System.out.println("Area of rectangle - " + (l*b));
    }

    @Override
    void SquareArea(int a) {
        System.out.println("Area of square - " + (a*a));
    }

    @Override
    void CircleArea(int r) {
        System.out.println("Area of circle - " + (22*7.0)*r*r);
    }
}

public class AreaHandler {
    public static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(20, 10);
        area.SquareArea(15);
        area.CircleArea(5);
    }
}
