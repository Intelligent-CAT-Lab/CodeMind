import java.util.Scanner;

public class p03328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int towerDis = b - a;
        int bHeight = towerDis * (towerDis + 1) / 2;
        int ans = bHeight - b;
        System.out.println(ans);
    }
}