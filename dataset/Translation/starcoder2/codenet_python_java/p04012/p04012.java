import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alfa.length(); i++) {
            if (w.length() % 2 == 1) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}