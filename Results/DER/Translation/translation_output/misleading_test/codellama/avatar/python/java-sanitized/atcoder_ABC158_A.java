import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("A") && s.contains("B")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}