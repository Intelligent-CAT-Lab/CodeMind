import java.util.Scanner;

public class p02951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int get = A - B;
        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}