import java.util.Scanner;

public class p02606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}


You can test this code with the following test input:


5 10 2


And it should output:


82