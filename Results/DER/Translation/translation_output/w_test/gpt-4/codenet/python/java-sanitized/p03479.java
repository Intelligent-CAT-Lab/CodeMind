import java.util.Scanner;

public class p03479 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int count = 1;
        long x = a;

        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }

        System.out.println(count);

        input.close();
    }
}