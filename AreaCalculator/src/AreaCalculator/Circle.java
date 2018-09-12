import java.lang.Math;

public class Circle {
    double Radius;

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    public double Area() {
        return Math.PI * (Radius * Radius);
    }
}
