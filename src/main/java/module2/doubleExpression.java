package module2;

public class doubleExpression {

    public static void main(String[] args) {

        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {

        final double epsilon = 0.0001;

        return a + b == c ? true : Math.abs(c - (b + a)) < epsilon;
    }
}
