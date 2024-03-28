import java.util.Scanner;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("abcd".repeat(n / 4) + "abc".substring(0, n % 4));
    }
}