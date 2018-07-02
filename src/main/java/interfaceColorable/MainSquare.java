package interfaceColorable;

public class MainSquare {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new  Square();
        squares[1] = new  Square(3.2, "blue");
        squares[2] = new  Square(3.5, "green");

        for (int i = 0; i < squares.length; i++) {
            squares[i].getArea();
            squares[i].howToColor();
            System.out.println();
        }
    }
}
