import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        t = t.replace('p', 'a').replace('q', 'p').replace('b', 'c').replace('d', 'b').replace('a', 'q').replace('c', 'd');
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}