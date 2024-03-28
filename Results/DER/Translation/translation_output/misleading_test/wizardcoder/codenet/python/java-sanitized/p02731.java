import java.util.Scanner;

public class p02731 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double hen = (double) L/3;
        double result = Math.pow(hen, 3);
        System.out.println(result);
    }
}