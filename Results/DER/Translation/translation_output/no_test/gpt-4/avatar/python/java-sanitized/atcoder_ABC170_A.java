import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading a line of input and splitting it into an array of strings
        String[] inputArray = scanner.nextLine().split(" ");
        
        // Iterating over the array and parsing integers, then checking for the value 0
        for (int e = 0; e < inputArray.length; e++) {
            int i = Integer.parseInt(inputArray[e]);
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
        }
        
        scanner.close();
    }
}