import java.util.Scanner;

public class p02389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(a * b + " " + (a + b) * 2);
    }
}


You can test this code with the following test input:


3 5


And it will output:


15 16