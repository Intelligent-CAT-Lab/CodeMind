import java.util.Scanner;

public class p03789 {
    private static int[] n;
    private static int lb, ub;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input as a string, convert it to a character array and then to int array
        char[] inputChars = scanner.nextLine().toCharArray();
        n = new int[inputChars.length];
        for (int i = 0; i < inputChars.length; i++) {
            n[i] = inputChars[inputChars.length - i - 1] - '0'; // reverse and convert to int
        }

        lb = 0;
        ub = n.length;

        //