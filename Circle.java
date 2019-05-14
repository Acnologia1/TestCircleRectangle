package Lession4;

public class Circle extends Geometric {
    //Mở rộng trường dữ liệu của lớp cha
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Chu vi
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //Diện tích
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    //Đường kính
    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The" + getColor() + "circle is created with the radius is" + radius);
    }
}
