import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
System.out.println("[INST]5;X;in.nextInt();"+X);
            int Y = in.nextInt();
System.out.println("[INST]6;Y;in.nextInt();"+Y);
            System.out.println(X + Y / 2);
        }
    }
}
