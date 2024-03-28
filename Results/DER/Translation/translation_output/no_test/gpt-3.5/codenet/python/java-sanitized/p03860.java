import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        
        String A = inputs[0];
        String x = inputs[1];
        String C = inputs[2];
        
        System.out.println("A" + x.charAt(0) + "C");
    }
}