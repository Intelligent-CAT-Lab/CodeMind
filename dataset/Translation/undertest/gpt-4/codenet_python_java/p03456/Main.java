import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        input.close();

        int n = Integer.parseInt(a + b);
        int sqrtn = (int) Math.sqrt(n);

        boolean found = false;
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No");
        }
    }
}