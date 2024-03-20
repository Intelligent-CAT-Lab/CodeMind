import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, c = 0, p = 0;
        String b = "";
        while (i < s.length()) {
            if (s.charAt(i) == b.charAt(0)) {
                if (c > p) {
                    p = c;
                }
                c = 0;
            }
            b = String.valueOf(s.charAt(i));
            i += s.charAt(i) == 'c' ? 7 : 3;
            c++;
        }
        if (c > p) {
            p = c;
        }
        System.out.println(p == 3 ? "egg" : "chicken");
    }
}