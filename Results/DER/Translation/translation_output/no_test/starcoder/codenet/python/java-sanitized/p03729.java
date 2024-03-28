import java.util.*;
public class p03729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        if (s[0].charAt(s[0].length() - 1) == s[1].charAt(0) && s[1].charAt(s[1].length() - 1) == s[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}