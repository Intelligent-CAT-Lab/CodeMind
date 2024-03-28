import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] result = new int[(int)Math.sqrt(n)+1];
        int index = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result[index] = Math.max(String.valueOf(i).length(), String.valueOf(n/i).length());
                index++;
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < index; i++) {
            if (result[i] < min) {
                min = result[i];
            }
        }
        
        System.out.println(min);
    }
}