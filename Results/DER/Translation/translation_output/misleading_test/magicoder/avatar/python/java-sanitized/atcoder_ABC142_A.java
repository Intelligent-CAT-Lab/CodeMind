import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((N + 1) / (double) N / 2);
        }
    }
}


You can test this code with the following test input:


64


And it should output:


22.04590006873798