import java.util.Scanner;

public class p03779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 2æ¬¡æ¹ç¨å¼ãè§£ã
        int t = (int) Math.ceil((-1 + (1 + 8 * x)) / 2.0);

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}