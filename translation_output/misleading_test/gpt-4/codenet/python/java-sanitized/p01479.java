import java.util.Scanner;

public class p01479 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        String b = "", r = "";
        
        while (i < s.length()) {
            if (s.charAt(i) == (b.isEmpty() ? ' ' : b.charAt(0))) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = Character.toString(s.charAt(i));
            i += (s.charAt(i) == 'c') ? 7 : 3;
            c++;
        }

        if (c > p) {
            r = b;
        }

        System.out.println(r.equals("e") ? "egg" : "chicken");
        scanner.close();
    }
}