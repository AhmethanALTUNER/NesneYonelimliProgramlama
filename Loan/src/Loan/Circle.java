package Loan;
public class Circle {
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [Yarıçap: " + radius + 
               ", Alan: " + String.format("%.2f", getArea()) + "]";
    }
}


