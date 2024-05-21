import java.util.*;

public class p02903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < a; j++) {
                    System.out.print(0);
                }
                for (int j = a; j < w; j++) {
                    System.out.print(1);
                }
            } else {
                for (int j = 0; j < a; j++) {
                    System.out.print(1);
                }
                for (int j = a; j < w; j++) {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}