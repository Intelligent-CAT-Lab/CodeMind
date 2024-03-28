import java.util.*;
public class p03723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (cnt!= 0 && a == a && b == b && c == c) {
                System.out.println(-1);
                return;
            }
            int tmp1 = a / 2;
            int tmp2 = b / 2;
            int tmp3 = c / 2;
            if (tmp1 % 1!= 0 || tmp2 % 1!= 0 || tmp3 % 1!= 0) {
                break;
            }
            cnt++;
            a = tmp2 + tmp3;
            b = tmp1 + tmp3;
            c = tmp1 + tmp2;
            if (a % 2!= 0 || b % 2!= 0 || c % 2!= 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}