import java.util.Scanner;

public class p03493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countOnes(input));
        scanner.close();
    }

    public static int countOnes(String input) {
        return (int) input.chars().filter(ch -> ch == '1').count();
    }
}

// Test case with the input "101"
class CountOnesTest {
    public static void main(String[] args) {
        String testInput = "101";
        int expectedOutput = 2;
        int actualOutput = CountOnes.countOnes(testInput);
        System.out.println("Test input: " + testInput);
        System.out.println("Expected output: " + expectedOutput);
        System.out.println("Actual output: " + actualOutput);
    }
}