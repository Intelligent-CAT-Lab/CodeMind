import java.util.Scanner;

public class p02116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n + 1) & - (n + 1));
    }
}