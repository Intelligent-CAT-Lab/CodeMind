import java.util.Scanner;

public class p02552 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int result = 1 - userInput;
        System.out.println(result);
    }
}

// For the test case where the input is 1,
// the expected output is 29. However, it seems that there is a mistake in the test case
// since the Python code will output 0 when the input is 1, not 29.