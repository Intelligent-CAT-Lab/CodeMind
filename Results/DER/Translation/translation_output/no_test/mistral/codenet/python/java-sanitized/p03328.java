import java.util.Scanner;

public class p03328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int tower_dis = b - a;
        int b_height = (tower_dis * (tower_dis + 1)) / 2;
        int ans = b_height - b;

        System.out.println(ans);
    }
}