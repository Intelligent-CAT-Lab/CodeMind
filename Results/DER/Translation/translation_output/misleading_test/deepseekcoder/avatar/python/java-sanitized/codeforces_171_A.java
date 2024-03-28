import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        String reversedB = new StringBuilder(numbers[1]).reverse().toString();
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(reversedB);
        System.out.println(a + b);
    }
}



You can test this code with the provided test case by running it and inputting "35005211 521595368" when prompted.