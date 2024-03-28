import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int K = a.count('K');
        int U = a.count('U');
        int P = a.count('P');
        int C = a.count('C');
        System.out.println(Math.min(K, U, P, C));
    }
}