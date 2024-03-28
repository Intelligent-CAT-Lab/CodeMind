import java.util.Scanner;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        int N = A.length();

        long C0 = A.chars().filter(ch -> ch == '0').count();
        long C1 = A.chars().filter(ch -> ch == '1').count();

        System.out.println(2 * Math.min(C0, C1));
    }
}