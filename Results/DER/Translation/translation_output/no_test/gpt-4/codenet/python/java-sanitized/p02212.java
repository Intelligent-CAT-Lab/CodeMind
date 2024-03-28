import java.util.*;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input and convert to integer array
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        // Sort the array
        Arrays.sort(numbers);
        
        // Calculate the absolute difference and print it
        int result = Math.abs((numbers[0] + numbers[3]) - (numbers[1] + numbers[2]));
        System.out.println(result);
        
        scanner.close();
    }
}