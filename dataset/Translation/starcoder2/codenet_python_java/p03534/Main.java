import java.util.Scanner;

public class p03534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            } else if (s.charAt(i) == 'b') {
                b++;
            } else if (s.charAt(i) == 'c') {
                c++;
            }
        }
        int max = Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a)));
        if (max <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}