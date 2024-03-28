import java.util.Scanner;

public class p01048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count++;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target++;
        }
    }
}



After the loop, it checks if the `count` variable is equal to `N`. If it is, it prints the value of `target` and breaks out of the loop. If it is not, it increments `target` and continues the loop.