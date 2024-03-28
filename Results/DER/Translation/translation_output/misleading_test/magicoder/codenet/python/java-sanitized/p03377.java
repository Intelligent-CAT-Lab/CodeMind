import java.util.Scanner;

public class p03377 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


You can test this code with the following test input:


3 5 4


And it will output:


YES