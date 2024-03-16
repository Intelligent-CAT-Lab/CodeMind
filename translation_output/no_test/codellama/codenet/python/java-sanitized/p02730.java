import java.util.Scanner;

public class p02730 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (s.equals(s.reverse()) && pre.equals(pre.reverse()) && suf.equals(suf.reverse())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}