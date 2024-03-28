import java.util.Scanner;

public class p02789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


You can test this code with the following test input:


3 3


And it will output:


Yes