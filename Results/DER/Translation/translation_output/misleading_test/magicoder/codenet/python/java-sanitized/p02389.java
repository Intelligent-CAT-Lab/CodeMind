import java.util.Scanner;

public class p02389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }
}



You can test this code with the following test input:


3 5


And the expected output will be:


15
16