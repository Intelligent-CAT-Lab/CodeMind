import java.util.Scanner;

public class p03965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = (int) s.chars().filter(ch -> ch == 'p').count();
        System.out.println(s.length() / 2 - count);
    }
}