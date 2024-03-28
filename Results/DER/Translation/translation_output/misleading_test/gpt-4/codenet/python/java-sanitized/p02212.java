import java.util.Arrays;
import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbers);
        
        int result = Math.abs((numbers[0] + numbers[3]) - (numbers[1] + numbers[2]));
        System.out.println(result);
        
        scanner.close();
    }
}