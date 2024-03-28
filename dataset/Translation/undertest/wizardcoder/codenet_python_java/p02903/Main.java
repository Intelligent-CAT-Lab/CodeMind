import java.util.Scanner;

public class p02903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println(new StringBuilder().append("0" * a).append("1" * (w - a)).toString());
            } else {
                System.out.println(new StringBuilder().append("1" * a).append("0" * (w - a)).toString());
            }
        }
    }
}