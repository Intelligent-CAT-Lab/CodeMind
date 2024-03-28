import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long vamshi = Long.parseLong(input[0]);
        long z = Long.parseLong(input[1]);
        System.out.println((vamshi / z + 1) * z);
    }
}