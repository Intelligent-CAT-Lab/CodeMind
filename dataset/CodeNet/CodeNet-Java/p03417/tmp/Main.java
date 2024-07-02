import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
System.out.println("[INST]7;N;sc.nextLong();"+N);
        final long M = sc.nextLong();
System.out.println("[INST]8;M;sc.nextLong();"+M);

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}
