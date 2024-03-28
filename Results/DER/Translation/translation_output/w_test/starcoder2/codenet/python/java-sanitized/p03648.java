import java.util.*;
public class p03648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        int[] ans = new int[50];
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = a + i;
        }
        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = a + 50 - b + i + 1;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}