import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
System.out.println("[INST]4;A;scanner.nextInt();"+A);
        int B = scanner.nextInt();
System.out.println("[INST]5;B;scanner.nextInt();"+B);

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}
