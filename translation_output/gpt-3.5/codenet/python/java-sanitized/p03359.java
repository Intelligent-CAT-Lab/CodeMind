import java.util.Scanner;

public class p03359 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}