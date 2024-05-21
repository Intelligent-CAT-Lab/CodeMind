import java.util.Scanner;

public class p03024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int a = 0;
        for (char i : x.toCharArray()) {
            if (i == 'x') {
                a += 1;
            }
        }
        System.out.println(a <= 7 ? "YES" : "NO");
    }
}