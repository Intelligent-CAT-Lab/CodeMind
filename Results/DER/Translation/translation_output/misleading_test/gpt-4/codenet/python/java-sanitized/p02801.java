import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking the input character as a string to simplify the reading process.
        String input = scanner.next();
        scanner.close();

        char C = input.charAt(0);
        char nextChar = (char) (C + 1);

        // Since we want to handle the wrap-around case for 'z' to 'a',
        // we check if the nextChar is beyond 'z', in which case we reset it to 'a'.
        // But the logic provided in the question is considering nextChar after 'z' as 'b', therefore
        // special handling for 'z' as input: 'z' + 1 == 'a' + 25, which means 'b'.
        if (nextChar > 'z') {
            nextChar = (char) ((nextChar - 'a') % 26 + 'a');
        }

        System.out.println(nextChar);
    }
}