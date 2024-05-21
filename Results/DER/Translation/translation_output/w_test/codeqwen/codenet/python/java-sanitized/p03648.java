import java.util.Scanner;

public class p03648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        StringBuilder ans = new StringBuilder();
        for (int i = 50 - b; i < 50; i++) {
            ans.append(a + i).append(" ");
        }
        for (int i = 0; i < b; i++) {
            ans.append(a + 50 - b + i + 1).append(" ");
        }
        System.out.println(ans.toString().trim());
    }
}