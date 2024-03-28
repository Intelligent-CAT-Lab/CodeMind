import java.util.*;
public class p02629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        while(n > 0) {
            res += (char)('a' + n % 26);
            n /= 26;
        }
        System.out.println(res.substring(0, res.length() - 1));
    }
}