import java.util.Scanner;

public class p03834 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String replaced = s.replace(",", " ");
        System.out.println(replaced);
    }
}