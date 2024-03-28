import java.util.Scanner;
import java.lang.Math;

public class p03264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(Math.ceil(k/2)*(k/2));
    }
}