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
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += 3;
            c++;
        }
        if (c > p) {
            r = b;
        }
        System.out.println(Arrays.asList("chicken", "egg")[r.equals("e")]);
    }
}