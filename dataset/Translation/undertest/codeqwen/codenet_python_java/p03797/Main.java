import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int s = Integer.parseInt(inputs[0]);
        int c = Integer.parseInt(inputs[1]);

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}