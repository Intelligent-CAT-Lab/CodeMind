import java.util.Scanner;

public class p03569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = 0, j = S.length() - 1, c = 0;
        while (true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i++;
                j--;
            } else {
                if (S.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (S.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}