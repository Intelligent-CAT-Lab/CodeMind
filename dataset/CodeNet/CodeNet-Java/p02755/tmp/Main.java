import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
System.out.println("[INST]9;A;scanner.nextInt();"+A);
        int B = scanner.nextInt();
System.out.println("[INST]10;B;scanner.nextInt();"+B);

        if(A > B) {
            System.out.println(-1);
            return;
        }

        for(int i = 1; i < 99999999; i ++) {
            if((int)(i * 0.08) == A &&  (int)(i * 0.10) == B) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
