package ComparableCircle;

public class ComparableCircle extends Circle implements Comparable {


    public ComparableCircle() {
        super();

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void compareTo() {
        if (getRadius() > 0) {
            System.out.println("Bán kính hình tròn là: " + getRadius());
            System.out.println("màu của hình tròn là: " + getColor());
        } else {
            System.out.println("Đây khong phải là hình tròn");
        }
    }
}
