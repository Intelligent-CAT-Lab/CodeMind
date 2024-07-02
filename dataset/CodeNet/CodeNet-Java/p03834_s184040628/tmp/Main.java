import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String a = sc.next();
System.out.println("[INST]10;a;sc.next();"+a);
        System.out.println(a.replaceAll(",", " "));
    }
}