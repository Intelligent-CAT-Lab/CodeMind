import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}