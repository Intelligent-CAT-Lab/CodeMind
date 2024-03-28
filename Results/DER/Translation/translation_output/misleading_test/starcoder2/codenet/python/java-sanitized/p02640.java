import java.util.Scanner;

public class p02640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int a = 0; a <= x; a++) {
            int b = x - a;
            if (2 * a + 4 * b == y) {
                count = 1;
                break;
            }
        }
        System.out.println(count == 1 ? "Yes" : "No");
    }
}