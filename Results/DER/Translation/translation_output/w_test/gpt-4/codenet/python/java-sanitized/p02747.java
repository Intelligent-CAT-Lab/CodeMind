import java.util.Scanner;

public class p02747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();
        
        if ("hi".equals(S) || "hihi".equals(S) || "hihihi".equals(S) || "hihihihi".equals(S) || "hihihihihi".equals(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}