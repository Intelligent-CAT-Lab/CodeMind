import java.util.Scanner;

public class p02629 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String res = "";
        while (N > 0) {
            N -= 1;
            res += (char) ('a' + N % 26);
            N /= 26;
        }
        StringBuilder sb = new StringBuilder(res);
        System.out.println(sb.reverse().toString());
    }
}