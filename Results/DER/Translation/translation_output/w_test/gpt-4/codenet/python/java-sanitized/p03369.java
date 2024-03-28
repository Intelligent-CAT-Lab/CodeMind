import java.util.Scanner;

public class p03369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int oCount = (int) s.chars().filter(ch -> ch == 'o').count();
        int result = 700 + 100 * oCount;
        
        System.out.println(result);
        scanner.close();
    }
}