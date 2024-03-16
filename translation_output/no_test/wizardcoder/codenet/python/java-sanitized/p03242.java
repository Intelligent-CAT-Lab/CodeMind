import java.util.Scanner;

public class p03242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.nextLine();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            ans += (moji.charAt(i) == '1')? "1" : "9";
        }
        System.out.println(ans);
    }
}