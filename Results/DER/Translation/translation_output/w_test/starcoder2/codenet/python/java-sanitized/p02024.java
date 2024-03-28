import java.util.Scanner;

public class p02024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }
    }
}