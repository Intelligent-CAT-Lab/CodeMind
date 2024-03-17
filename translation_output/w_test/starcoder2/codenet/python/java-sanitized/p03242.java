import java.util.Scanner;

public class p03242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            if (moji.charAt(i) == '1') {
                ans += "9";
            } else {
                ans += "1";
            }
        }
        System.out.println(ans);
    }
}