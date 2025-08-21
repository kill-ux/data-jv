import java.lang.Math;

public class AreaCalculator {
    public double calculate(double radius) {
        // calculate area of circle
        // 𝜋 × radius²
        return radius * radius * Math.PI;
    }

    public double calculate(double width, double height) {
        // calculate area of rectangle // Area = width × height
        return width * height;
    }

    public double calculate(double base, double height, boolean isTriangle) {
        // calculate area of triangle Area = ½ × base × height
        return 0.5 * base * height;
    }

    public double calculate(double side, boolean isSquare) {
        // calculate area of square // Area = side²
        return side * side;
    }
}