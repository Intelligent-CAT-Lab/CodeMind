import java.util.Scanner;

public class p03861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(inputParts[0]);
        int b = Integer.parseInt(inputParts[1]);
        int x = Integer.parseInt(inputParts[2]);
        
        int result = b / x - (a - 1) / x;
        
        System.out.println(result);
        
        scanner.close();
    }
}