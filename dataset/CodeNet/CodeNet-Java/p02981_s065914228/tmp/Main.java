import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
System.out.println("[INST]6;N;scanner.nextInt();"+N);
        int A = scanner.nextInt();
System.out.println("[INST]7;A;scanner.nextInt();"+A);
        int B = scanner.nextInt();
System.out.println("[INST]8;B;scanner.nextInt();"+B);

        int ans = Math.min(A*N, B);
System.out.println("[INST]10;ans;Math.min(A*N, B);"+ans);

        System.out.println(ans);

    }
}
