import java.util.*;
public class p02256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
        }
        while (x % y!= 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        System.out.println(y);
    }
}