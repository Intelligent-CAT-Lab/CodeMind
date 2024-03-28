import java.util.Scanner;

public class p02945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int max = Math.max(Math.max(a - b, a + b), a * b);
        System.out.println(max);
    }
}


You can test this code with the following test input:


-13 3


And it should output:


41