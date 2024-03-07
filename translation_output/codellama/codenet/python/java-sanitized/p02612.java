import java.util.Scanner;

public class p02612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = n % 1000;
        if (remainder != 0) {
            System.out.println(1000 - remainder);
        } else {
            System.out.println(0);
        }
    }
}



Next, we calculate the remainder of the input number divided by 1000 using the `%` operator. If the remainder is not equal to 0, we print the difference between 1000 and the remainder. Otherwise, we print 0.