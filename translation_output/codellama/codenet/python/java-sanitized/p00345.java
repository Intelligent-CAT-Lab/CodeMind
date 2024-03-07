import java.util.Scanner;

public class p00345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int o = input.indexOf('.');
        int p = input.indexOf('(');
        int d = input.length() - o - 1;
        int l = p - o - 1;
        String all = "";
        String sub = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                o = i;
            } else if (input.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (input.charAt(i) != ')') {
                all += input.charAt(i);
            }
        }
        if (p == -1) {
            printV(Integer.parseInt(all), 10**d);
        } else {
            d -= 2; // for ()
            printV(Integer.parseInt(all) - Integer.parseInt(sub), 10**d - 10**l);
        }
    }

    public static void printV(int x, int y) {
        int g = gcd(x, y);
        System.out.println(x / g + "/" + y / g);
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}