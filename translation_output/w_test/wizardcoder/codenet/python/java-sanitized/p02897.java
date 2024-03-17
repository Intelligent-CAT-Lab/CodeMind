import java.util.Scanner;

public class p02897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double result = -(-N/2.0)/N;
        System.out.println(result);
    }
}