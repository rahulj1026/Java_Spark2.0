package logics;

abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Cone extends Shape {
    public double radius;
    public double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 10);
        System.out.println("Cone Area: " + cone.area());
        System.out.println("Cone Volume: " + cone.volume());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}
