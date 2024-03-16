import java.util.Scanner;

public class p03545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.next();
        
        int a = Character.getNumericValue(n.charAt(0));
        int b = Character.getNumericValue(n.charAt(1));
        int c = Character.getNumericValue(n.charAt(2));
        int d = Character.getNumericValue(n.charAt(3));
        
        if ((a + b + c + d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a + b + c - d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a + b - c + d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a + b - c - d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a - b + c + d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a - b + c - d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a - b - c + d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a - b - c - d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
        
        scanner.close();
    }
}