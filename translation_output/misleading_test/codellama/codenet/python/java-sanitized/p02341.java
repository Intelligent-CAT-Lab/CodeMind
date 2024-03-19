import java.util.Scanner;

public class p02341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(n <= k ? 1 : 0);
    }
}