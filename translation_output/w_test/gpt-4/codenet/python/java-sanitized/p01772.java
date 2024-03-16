import java.util.Scanner;

public class p01772 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' && !flag) flag = true;
            if (c == 'Z' && flag) {
                ans.append("AZ");
                flag = false;
            }
        }
        if (ans.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        scanner.close();
    }
}