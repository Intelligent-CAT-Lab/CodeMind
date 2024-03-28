import java.util.Scanner;

public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.abs(x-a) < Math.abs(x-b) ? "A" : "B");
    }
}