import java.util.Scanner;

public class p03047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(N - (K - 1));
    }
}


You can test this code with the following test input:


3 2


And it should output:


82