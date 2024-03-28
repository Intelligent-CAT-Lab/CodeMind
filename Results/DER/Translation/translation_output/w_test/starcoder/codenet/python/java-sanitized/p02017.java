import java.util.*;
public class p02017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if ((H * W) * (X + Y) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}