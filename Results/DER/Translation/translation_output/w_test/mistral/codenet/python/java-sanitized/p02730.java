import java.util.Scanner;

public class p02730 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (s.equals(new StringBuilder(s).reverse().toString()) && pre.equals(new StringBuilder(pre).reverse().toString()) && suf.equals(new StringBuilder(suf).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}