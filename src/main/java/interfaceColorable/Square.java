package interfaceColorable;

public class Square implements Colorable {
    @Override
    public void howToColor() {
        if (getCanh() > 0) {
            System.out.println("Color all four sides is " + getColor());
        }
    }

    private double canh;
    private String color;

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Square() {

    }

    public Square(double canh, String color) {
        this.canh = canh;
        this.color = color;
    }

    public void getArea() {
        if (getCanh() > 0) {
            System.out.println("Diện tích hình vuông có độ dài 4 cạnh=" + getCanh() + " là: " + Math.pow(getCanh(), 2));
        } else {
            System.out.println("Đây không phải là hình vuông.");
        }
    }
}
