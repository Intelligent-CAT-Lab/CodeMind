import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        int nInt = (int)n;
        double result;
        if (n * Math.sqrt(2) < nInt + 1) {
            result = n * Math.sqrt(2);
        } else {
            result = nInt + 1;
        }
        System.out.println(result);
    }
}