import java.util.Scanner;

/**
 * Water Bottle
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
System.out.println("[INST]9;A;sc.nextInt();"+A);
            int B = sc.nextInt();
System.out.println("[INST]10;B;sc.nextInt();"+B);
            int X = sc.nextInt();
System.out.println("[INST]11;X;sc.nextInt();"+X);

            double d;
            if (X * 2 >= A * A * B) {
                double z = (double) (A * A * B - X) / A / A * 2;
                d = Math.atan(z / A) * 180 / Math.PI;
System.out.println("[INST]16;None;Math.atan(z / A);"+Math.atan(z / A));
            } else {
                double z = (double) (X) / A / B * 2;
                d = Math.atan(B / z) * 180 / Math.PI;
System.out.println("[INST]19;None;Math.atan(B / z);"+Math.atan(B / z));
            }

            System.out.println(d);
        }
    }

}
