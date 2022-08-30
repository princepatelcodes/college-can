class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) ((22 / 7.0) * radius * radius);
    }

    public float getCircumference() {
        return (float) (2 * (22 / 7.0) * radius * radius);
    }

    public String toString() {
        return "A circle of radius " + radius + "cm";
    }
}

public class MultiCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println("The area of circle c1 is " + c1.getArea());
        System.out.println("The circumference of circle c1 is " + c1.getCircumference());
        Circle c2 = new Circle(8);
        System.out.println(c2);
        c2.setRadius(10);
        System.out.println("The new radius of c2 circle is " + c2.getRadius() + "cm");
    }
}