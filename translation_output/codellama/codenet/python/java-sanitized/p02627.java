import java.util.Scanner;

public class p02627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (n.equals(n.toUpperCase())) {
            System.out.println("A");
        } else if (n.equals(n.toLowerCase())) {
            System.out.println("a");
        }
    }
}


Next, we check if the input is equal to its uppercase version using the `equals()` method. If it is, we print "A" to the console. If it is not, we check if it is equal to its lowercase version using the `equals()` method. If it is, we print "a" to the console.