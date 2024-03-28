import java.util.Scanner;

public class p03623 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}