import java.util.Arrays;
import java.util.Scanner;

public class p04043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading three integers from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Creating an array from the input integers
        int[] numbers = {a, b, c};
        
        // Sorting the array
        Arrays.sort(numbers);
        
        // Checking if the sorted array matches the required pattern
        if(numbers[0] == 5 && numbers[1] == 5 && numbers[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}