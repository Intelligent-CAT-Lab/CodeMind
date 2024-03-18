import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String result = (s.contains("A") && s.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}