import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long K = in.nextLong();
System.out.println("[INST]5;K;in.nextLong();"+K);
        Long A = in.nextLong();
System.out.println("[INST]6;A;in.nextLong();"+A);
        Long B = in.nextLong();
System.out.println("[INST]7;B;in.nextLong();"+B);

        if (A >= K) {
            System.out.println(1);
        } else if (A <= B) {
            System.out.println(-1);
        } else if ((K - A) % (A - B) == 0) {
            System.out.println(((K - A) / (A - B)) * 2 + 1);
        } else {
            System.out.println(((K - A) / (A - B)) * 2 + 3);
        }
    }
}