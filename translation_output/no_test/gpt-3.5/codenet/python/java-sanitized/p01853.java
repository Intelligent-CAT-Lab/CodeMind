import java.util.Scanner;

public class p01853 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        String[] points = new String[n];

        for (int i = n/2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        System.out.println(String.join(" ", points));
    }
}