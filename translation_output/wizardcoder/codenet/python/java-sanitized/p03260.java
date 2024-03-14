import java.util.Scanner;

public class p03260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Yes" + (a % 2!= 0 && b % 2!= 0? "" : "No"));
    }
}