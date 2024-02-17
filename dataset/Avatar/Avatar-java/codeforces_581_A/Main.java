import java.util.*;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " ▁ " + ans);
    }
}