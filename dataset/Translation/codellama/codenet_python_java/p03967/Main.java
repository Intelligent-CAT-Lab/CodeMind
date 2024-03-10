import java.util.Scanner;

public class p03967 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                ret += (i % 2) - 1;
            } else {
                ret += (i % 2) - 0;
            }
        }
        System.out.println(ret);
    }
}