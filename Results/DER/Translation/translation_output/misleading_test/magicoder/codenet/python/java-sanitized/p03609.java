import java.util.Scanner;

public class p03609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        int result = x - t;
        System.out.println(result > 0 ? result : 0);
    }
}


You can test this code with the following test input:


100 17


And it will output:


43