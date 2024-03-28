import java.util.Scanner;

public class p02399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        double result = (double) a / b;
        int quotient = (int) result;
        double remainder = result - quotient;
        
        System.out.println(quotient + " " + remainder + " " + result);
    }
}