import java.util.Scanner;

public class p03316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sn = 0;
        for (int i = 0; i < n.length(); i++) {
            sn += Character.getNumericValue(n.charAt(i));
        }
        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}