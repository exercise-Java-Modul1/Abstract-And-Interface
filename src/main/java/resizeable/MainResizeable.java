package resizeable;

public class MainResizeable {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.5, 7);
        Circle circle = new Circle(4.1);
        Rectangle square = new Square(4.5, 4.5);

        System.out.println("Diện tích hình chữ nhật với dài=" + rectangle.getHeight() + " chiều rộng=" + rectangle.getWidth() + " là: " + rectangle.getArea());
        rectangle.resize(0.3);
        System.out.println("Diện tích hình tròn có bán kính = " + circle.getRadius() + " là:" + circle.getArea());
        circle.setRadius(0.5);
        System.out.println("Diện tích hình vuông với dài mỗi cạnh = " + square.getWidth() + " là: " + square.getArea());
        square.resize(0.7);
    }
}
