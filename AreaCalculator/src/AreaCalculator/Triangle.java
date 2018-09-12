import javafx.geometry.Side;

public class Triangle {
    double Side_Length;
    double Height;

    public Triangle(double Side_Length, double Height) {
        this.Side_Length = Side_Length;
        this.Height = Height;
    }

    public double Area() {

        return (Side_Length * Height) / 2;
    }
}
