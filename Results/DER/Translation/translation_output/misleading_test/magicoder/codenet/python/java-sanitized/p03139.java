import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int min = Math.min(A, B);
        int max = Math.max(A + B - N, 0);

        System.out.println(min + " " + max);
    }
}


You can test this code with the following test input:


10 3 5


And it should output:


5 5