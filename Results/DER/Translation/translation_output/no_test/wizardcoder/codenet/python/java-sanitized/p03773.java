import java.util.Scanner;

public class p03773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum = (a + b) % 24;
        System.out.println(sum);
    }
}