import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long vamshi = scanner.nextLong();
        long z = scanner.nextLong();
        System.out.println((vamshi / z + 1) * z);
    }
}