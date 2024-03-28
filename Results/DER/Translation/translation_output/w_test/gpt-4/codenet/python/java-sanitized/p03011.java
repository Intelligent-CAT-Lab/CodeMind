import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        int max = Math.max(a, Math.max(b, c));
        int sumWithoutMax = a + b + c - max;
        
        System.out.println(sumWithoutMax);
        
        scanner.close();
    }
}