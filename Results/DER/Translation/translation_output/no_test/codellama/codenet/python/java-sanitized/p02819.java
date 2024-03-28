import java.util.Scanner;

public class p02819 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.out.println(num);
        }
    }
}