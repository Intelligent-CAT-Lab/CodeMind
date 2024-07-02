import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
System.out.println("[INST]11;n;input.nextInt();"+n);
        int d = input.nextInt();
System.out.println("[INST]12;d;input.nextInt();"+d);

        int ans = 0;

        while(n > 0) {
        	ans++;
        	n = n - 1 - 2*d;
        }

        System.out.println(ans);

    }
}
