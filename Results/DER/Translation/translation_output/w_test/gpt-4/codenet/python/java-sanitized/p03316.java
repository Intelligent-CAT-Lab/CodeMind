import java.util.Scanner;

public class p03316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();

        int sn = 0;

        for (int i = 0; i < n.length(); i++) {
            sn += Character.getNumericValue(n.charAt(i));
        }

        if (Integer.parseInt(n) % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}