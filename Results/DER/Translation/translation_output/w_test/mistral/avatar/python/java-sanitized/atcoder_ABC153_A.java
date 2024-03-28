import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((int) Math.ceil(h / a));
    }
}