import java.util.Scanner;

public class p03328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tower_dis = b - a;
        int b_height = tower_dis * (tower_dis + 1) / 2;
        int ans = b_height - b;

        System.out.println(ans);
    }
}