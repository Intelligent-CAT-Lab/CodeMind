import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, c = 0, p = 0;
        String b = "";
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    b = s.charAt(i);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (b == 'c') ? 3 : 7;
            c++;
        }
        if (c > p) {
            b = s.charAt(i);
        }
        System.out.println(b == 'e' ? "egg" : "chicken");
    }
}