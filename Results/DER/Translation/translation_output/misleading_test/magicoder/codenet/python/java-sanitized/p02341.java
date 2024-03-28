import java.util.Scanner;

public class p02341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n <= k) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}


You can test this code with the following test input:


5 10


And it should output:


1