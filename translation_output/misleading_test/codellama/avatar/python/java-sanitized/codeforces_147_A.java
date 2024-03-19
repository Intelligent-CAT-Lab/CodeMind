import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String output = "";
        for (String token : tokens) {
            output += token + " ";
        }
        System.out.println(output.trim());
    }
}



$ java Solution
a!n, to
a! n, to