import java.util.Scanner;

public class p02162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int t1 = Integer.parseInt(inputs[0]);
        int t2 = Integer.parseInt(inputs[1]);
        int r1 = Integer.parseInt(inputs[2]);
        int r2 = Integer.parseInt(inputs[3]);

        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}