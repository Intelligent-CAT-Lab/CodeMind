import java.util.Scanner;

public class p04030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = "";
        for (char c : s.toCharArray()) {
            if (c == 'B') {
                if (!a.isEmpty()) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += c;
            }
        }
        System.out.println(a);
    }
}