import java.util.Scanner;

public class p02223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n-1);
            for (int i = 0; i < n-1; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("1").append("0".repeat(i)).append("1");
                System.out.println(sb.toString());
            }
        }
    }
}