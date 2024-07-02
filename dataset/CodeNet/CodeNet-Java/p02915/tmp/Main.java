
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
System.out.println("[INST]10;S;scanner.nextInt();"+S);
        int ans = S * S* S;


        System.out.println(ans);
    }
}
