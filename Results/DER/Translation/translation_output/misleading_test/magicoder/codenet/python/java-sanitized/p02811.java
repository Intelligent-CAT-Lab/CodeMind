import java.util.Scanner;

public class p02811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        if (500 * K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


You can test this code with the following test input:


2 900


And it should output:


Yes