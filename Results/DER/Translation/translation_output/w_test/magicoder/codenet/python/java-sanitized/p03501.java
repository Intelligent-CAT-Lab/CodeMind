import java.util.Scanner;

public class p03501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(Math.min(A * N, B));
    }
}


You can test this code with the following test input:


7 17 120


And it will output:


119