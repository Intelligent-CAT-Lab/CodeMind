import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}
