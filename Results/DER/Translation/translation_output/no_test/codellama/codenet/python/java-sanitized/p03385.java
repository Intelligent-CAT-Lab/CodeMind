import java.util.Scanner;

public class p03385 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("a") && input.contains("b") && input.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


Next, we check if the input string contains the characters "a", "b", and "c" using the `contains()` method. If it does, we print "Yes" to the console. Otherwise, we print "No".