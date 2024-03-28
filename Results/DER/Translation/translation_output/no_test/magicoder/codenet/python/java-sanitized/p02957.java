import java.util.Scanner;

public class p02957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        double x = ((double)(A*A - B*B)) / (2*(A - B));
        if (x % 1 == 0) {
            System.out.println((int)x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}