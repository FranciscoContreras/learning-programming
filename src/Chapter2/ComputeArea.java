package Chapter2;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;

        // Assign a radius
        radius = 20;

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of the radius " + radius + " is " + area);
    }
}
