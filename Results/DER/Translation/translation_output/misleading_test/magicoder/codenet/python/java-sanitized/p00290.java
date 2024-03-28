import java.util.Scanner;

public class p00290 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(a * b);
    }
}


You can test this code with the following test input:


20 2


And it will output:


-24