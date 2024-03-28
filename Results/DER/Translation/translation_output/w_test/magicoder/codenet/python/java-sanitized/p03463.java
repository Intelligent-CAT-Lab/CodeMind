import java.util.Scanner;

public class p03463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}


You can test this code with the following test input:


5 2 4


And it will output:


Alice