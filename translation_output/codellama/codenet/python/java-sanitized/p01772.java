import java.util.Scanner;

public class p01772 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' && !flag) {
                flag = true;
            } else if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}