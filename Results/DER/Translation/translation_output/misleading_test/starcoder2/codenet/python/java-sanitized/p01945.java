import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.indexOf('*');
        int p = Math.abs(s.substring(0, n).chars().filter(c -> c == '(').count() - s.substring(0, n).chars().filter(c -> c == ')').count());
        int q = Math.abs(s.substring(n + 1).chars().filter(c -> c == '(').count() - s.substring(n + 1).chars().filter(c -> c == ')').count());
        System.out.println(Math.min(p, q));
    }
}