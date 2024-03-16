import java.util.Scanner;

public class p02016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("ani")) {
            System.out.println("square1001");
        } else {
            System.out.println("e869120");
        }
    }
}



Next, we use the `equals()` method to compare the input with the string "ani". If the input is equal to "ani", we print "square1001" to the console. Otherwise, we print "e869120".