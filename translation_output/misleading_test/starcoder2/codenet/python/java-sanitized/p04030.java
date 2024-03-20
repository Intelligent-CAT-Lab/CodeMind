import java.util.Scanner;

public class p04030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                if (!a.equals("")) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += s.charAt(i);
            }
        }
        System.out.println(a);
    }
}