package resizeable;

public class Rectangle implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (getWidth()*getHeight());
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật mới khi tăng kích thước của nó lên " + percent + "% là: " + getArea()*percent);
    }
}
