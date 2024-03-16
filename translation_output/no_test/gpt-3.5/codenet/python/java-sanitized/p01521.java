import java.util.Scanner;

public class p01521 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {
            System.out.println("x");
        } else {
            System.out.println("o");
        }
    }
}