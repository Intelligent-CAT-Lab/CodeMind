import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
        int ans = 0;
        if (n >= 'a' && n <= 'z') {
            ans = 2;
        } else if (n >= 'A' && n <= 'Z') {
            ans = 1;
        }
        System.out.println(ans);
    }
}
