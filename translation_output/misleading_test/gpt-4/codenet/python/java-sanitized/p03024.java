import java.util.Scanner;

public class p03024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'x') {
                a++;
            }
        }

        String result = a <= 7 ? "YES" : "NO";
        System.out.println(result);
    }
}