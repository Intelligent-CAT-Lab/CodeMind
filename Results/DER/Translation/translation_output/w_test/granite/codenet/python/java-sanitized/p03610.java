import java.util.Scanner;

public class p03610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = s.substring(0, 1);
        for (int i = 2; i < s.length(); i += 2) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}