import java.util.Scanner;

public class p02731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L = scanner.nextInt();
        double hen = (double)L / 3;
        double result = Math.pow(hen, 3);
        
        System.out.println(String.format("%.12f", result));
    }
}