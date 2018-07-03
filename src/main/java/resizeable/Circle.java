package resizeable;

public class Circle implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.pow(getRadius(), 2))*Math.PI;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn mới khi tăng kích thước của nó lên " + percent + "% là: " + getArea()*percent);
    }
}
