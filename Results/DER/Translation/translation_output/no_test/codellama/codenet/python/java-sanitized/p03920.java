import java.util.Scanner;

public class p03920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;
        for (int i = 1; i <= 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i >= 1; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}


After that, it uses another for loop to iterate over the range of numbers from `w` to 1, and checks if the current number is greater than or equal to the input number. If it is, it prints the current number and subtracts it from the input number.