import java.util.Scanner;

public class p02629 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        while (N > 0) {
            N--;
            res.append((char) ('a' + N % 26));
            N /= 26;
        }
        System.out.println(res.reverse().toString());
    }
}