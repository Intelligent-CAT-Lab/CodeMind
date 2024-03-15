import java.util.Scanner;

public class p04043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (Arrays.asList(a, b, c).stream().sorted().toList().equals(Arrays.asList(5, 5, 7))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}