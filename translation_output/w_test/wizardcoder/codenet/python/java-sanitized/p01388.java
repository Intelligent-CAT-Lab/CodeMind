import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = 0, u = 0, p = 0, c = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'K') {
                k++;
            } else if (ch == 'U') {
                u++;
            } else if (ch == 'P') {
                p++;
            } else if (ch == 'C') {
                c++;
            }
        }
        System.out.println(Math.min(k, Math.min(u, Math.min(p, c))));
    }
}