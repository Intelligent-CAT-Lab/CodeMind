import java.util.Scanner;

public class p01997 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double volume = 4/3*Math.PI*B*B*B;
        System.out.println(String.format("%.10f", volume));
    }
}