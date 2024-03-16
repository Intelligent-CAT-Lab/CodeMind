import java.util.Scanner;

public class p03071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int[] list = {A + B, 2 * A - 1, 2 * B - 1};
        
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            max = Math.max(max, num);
        }
        
        System.out.println(max);
    }
}