import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        double result1 = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double result2 = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        double result3 = b * Math.sin(Math.toRadians(c));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}