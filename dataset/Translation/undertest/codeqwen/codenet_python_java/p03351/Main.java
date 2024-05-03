import java.util.Scanner;

public class p03351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);

        boolean condition = !(Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d));
        System.out.println(condition ? "YNeos" : "es");
    }
}