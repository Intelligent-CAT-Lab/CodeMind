import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
System.out.println("[INST]6;L;scanner.nextInt();"+L);
        int R = scanner.nextInt();
System.out.println("[INST]7;R;scanner.nextInt();"+R);
        int d = scanner.nextInt();
System.out.println("[INST]8;d;scanner.nextInt();"+d);

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
