import java.util.*;
public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                System.out.println(m);
                break;
            }
            m -= i + 1;
            i++;
            i %= n;
        }
    }
}