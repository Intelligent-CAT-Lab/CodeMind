import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        
        double result = n/Math.ceil(n) + 1;
        if (n*Math.sqrt(2) < Math.ceil(n) + 1) {
            result = n*Math.sqrt(2);
        }
        
        System.out.println(result);
    }
}