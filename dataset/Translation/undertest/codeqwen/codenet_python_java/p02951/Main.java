import java.util.Scanner;

public class p02951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);

        int get = A - B;

        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}