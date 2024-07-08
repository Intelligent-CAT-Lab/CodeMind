import java.util.Scanner;

/**
 * Water Bottle
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            double d;
            if (X * 2 >= A * A * B) {
                double z = (double) (A * A * B - X) / A / A * 2;
var newVariable_0 = Math.atan(z / A);                d = newVariable_0 * 180 / Math.PI;
            } else {
                double z = (double) (X) / A / B * 2;
var newVariable_1 = Math.atan(B / z);                d = newVariable_1 * 180 / Math.PI;
            }

            System.out.println(d);
        }
    }

}
