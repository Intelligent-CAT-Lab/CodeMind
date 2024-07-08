import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        char[] s = newVariable_0.toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
