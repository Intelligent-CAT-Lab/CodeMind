import java.util.Scanner;

public class p02256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(y);
    }
}