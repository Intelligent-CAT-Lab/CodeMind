import java.util.Scanner;

public class p02835 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}


You can test this code with the following test input:


5 7 9


And it will output:


win