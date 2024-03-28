import java.util.Scanner;

public class p03059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        System.out.println((t / a) * b);
    }
}



You can test this code with the following test input:


3 5 7


And it should print:


10