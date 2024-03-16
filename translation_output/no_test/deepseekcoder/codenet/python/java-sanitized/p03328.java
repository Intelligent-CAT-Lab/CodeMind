import java.util.Scanner;

public class p03328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int towerDis = b - a;
        int bHeight = towerDis * (towerDis + 1) / 2;
        int ans = bHeight - b;

        System.out.println(ans);
    }
}