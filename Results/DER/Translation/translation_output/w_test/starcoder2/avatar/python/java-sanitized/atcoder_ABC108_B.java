import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}