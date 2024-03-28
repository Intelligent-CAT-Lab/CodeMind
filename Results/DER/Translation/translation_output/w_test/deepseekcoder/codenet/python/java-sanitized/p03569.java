import java.util.Scanner;

public class p03569 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        while(true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                if (S.charAt(i) == 'x') {
                    i += 1;
                    c += 1;
                } else if (S.charAt(j) == 'x') {
                    j -= 1;
                    c += 1;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}