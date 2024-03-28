import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c - max;

        System.out.println(sum);
    }
}


You can test this code with the following test input:


1 3 4


And it will output:


4