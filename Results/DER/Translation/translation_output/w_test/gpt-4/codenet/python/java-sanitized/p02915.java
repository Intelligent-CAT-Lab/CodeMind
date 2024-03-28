import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            try {
                int n = Integer.parseInt(input.split("\\s+")[0]);
                System.out.println((int) Math.pow(n, 3));
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter a valid integer");
                break;
            }
        }
        
        scanner.close();
    }
}