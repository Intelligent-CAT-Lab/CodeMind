import java.util.Scanner;

public class p03463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Assuming 'a' is being read but not used, as per Python code.
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
        sc.close();
    }
}