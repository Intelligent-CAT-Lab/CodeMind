import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sqrtN = Math.sqrt(n);
        double floorN = Math.floor(n);
        double result = sqrtN < floorN + 1 ? floorN + 1 : sqrtN;
        System.out.println(result);
    }
}