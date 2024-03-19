import java.util.Scanner;

public class p03359 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}


You can test this code with the following test input:


5 5


And it will output:


5