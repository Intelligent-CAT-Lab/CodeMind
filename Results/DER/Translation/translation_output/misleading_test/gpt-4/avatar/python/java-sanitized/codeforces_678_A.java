import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long vamshi = scanner.nextLong();
        long z = scanner.nextLong();
        long result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}