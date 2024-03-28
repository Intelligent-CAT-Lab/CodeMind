import java.util.Scanner;

public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println((a + b) % 24);
    }
}


You can test this code with the following test input:


9 12


And it will output:


80