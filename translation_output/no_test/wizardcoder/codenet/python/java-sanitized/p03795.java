import java.util.Scanner;

public class p03795 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 800*N - 200*(N/15);
        System.out.println(result);
    }
}