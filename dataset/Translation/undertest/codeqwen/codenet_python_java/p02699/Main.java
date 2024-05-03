import java.util.Scanner;

public class p02699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int s = Integer.parseInt(inputs[0]);
        int w = Integer.parseInt(inputs[1]);

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}