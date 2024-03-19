import java.util.Scanner;

public class p03337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int max = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(max);
    }
}


You can test this code with the following test input:


3 1


And it will output:


87