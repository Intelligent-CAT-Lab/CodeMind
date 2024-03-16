import java.util.Scanner;

public class p01722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n == 0? 1 : 2 / n);
    }
}