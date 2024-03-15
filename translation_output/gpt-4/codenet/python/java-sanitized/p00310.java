import java.util.Scanner;

public class p00310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input and splitting it by spaces
        String[] input = scanner.nextLine().split(" ");
        
        // Parsing input to integers
        int p = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        // Calculating the sum
        int sum = p + m + c;
        
        // Printing the sum
        System.out.println(sum);
        
        scanner.close();
    }
}