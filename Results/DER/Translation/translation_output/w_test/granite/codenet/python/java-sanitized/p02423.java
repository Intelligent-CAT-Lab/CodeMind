import java.util.Scanner;

public class p02423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1<<32)-1;
        System.out.println(String.format("%032d", n));
        System.out.println(String.format("%032d", ~n & mask));
        System.out.println(String.format("%032d", (n<<1)& mask));
        System.out.println(String.format("%032d", (n>>1)& mask));
    }
}