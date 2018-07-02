package ComparableCircle;

import java.util.Arrays;

public class MainComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        circles[0].compareTo();
        circles[1].compareTo();
        circles[2].compareTo();
        Arrays.sort(circles);

    }
}
