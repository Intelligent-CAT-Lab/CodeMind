import java.util.*;
public class p03285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 25; i >= 0; i--) {
            for (int j = 20; j >= 0; j--) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}