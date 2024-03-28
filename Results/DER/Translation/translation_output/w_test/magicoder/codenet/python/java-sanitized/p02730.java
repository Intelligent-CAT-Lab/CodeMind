import java.util.Scanner;

public class p02730 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        String reversed = new StringBuilder(s).reverse().toString();
        String reversedPre = new StringBuilder(pre).reverse().toString();
        String reversedSuf = new StringBuilder(suf).reverse().toString();

        if (s.equals(reversed) && pre.equals(reversedPre) && suf.equals(reversedSuf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}