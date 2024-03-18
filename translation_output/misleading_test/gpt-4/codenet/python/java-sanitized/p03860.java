import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        String A = input[0];
        String x = input[1];
        String C = input[2];
        
        System.out.println("A" + x.charAt(0) + "C");
        
        scanner.close();
    }
}