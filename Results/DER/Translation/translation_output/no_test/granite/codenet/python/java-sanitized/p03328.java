import java.util.Scanner;

public class p03328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int towerDis = b - a;
        int bHeight = (towerDis * (towerDis + 1)) / 2;
        int ans = bHeight - b;
        System.out.println(ans);
    }
}