import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.printf("%.10f\n", B * B * B * Math.PI / 3.0 * 4.0);
        }
    }
}

