import java.util.Scanner;

public class p03992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}



Next, we use the `substring()` method to extract the first 4 characters of the input string and the remaining characters. We then concatenate the two substrings with a space in between them using the `+` operator. Finally, we print the resulting string to the console using the `System.out.println()` method.