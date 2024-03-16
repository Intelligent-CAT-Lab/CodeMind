import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading and splitting the input, then parsing it as integers.
        String[] inputs = scanner.nextLine().split(" ");
        int[] ABC = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            ABC[i] = Integer.parseInt(inputs[i]);
        }
        
        // Count occurrences of 5
        int countOfFive = 0;
        for (int number : ABC) {
            if (number == 5) {
                countOfFive++;
            }
        }
        
        // Check the conditions similar to the Python code
        if (countOfFive == 2) {
            // Calculate the sum of the array elements
            int sum = 0;
            for (int number : ABC) {
                sum += number;
            }
            
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}