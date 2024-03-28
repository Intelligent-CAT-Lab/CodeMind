import java.util.Scanner;

public class p02687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}



Next, we check if the input string is equal to "ARC" using the `equals()` method. If it is, we print "ABC" to the console. Otherwise, we print "ARC" to the console.