import java.util.Scanner;

public class p03943 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String ans = "No";
        if (a + b == c || a + c == b || b + c == a) {
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}