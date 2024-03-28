import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[2];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        int k = (n[1] / n[0]).bitLength();
        System.out.println(k);
    }
}