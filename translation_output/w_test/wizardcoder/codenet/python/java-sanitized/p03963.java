import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = k * (k - 1) * (k - 2) *... * (k - k + 1);
        System.out.println(result);
    }
}