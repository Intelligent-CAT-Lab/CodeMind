import java.util.Scanner;

public class p02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if ((H * W) * (X + Y) % 2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}