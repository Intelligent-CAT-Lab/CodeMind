import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int result = Math.max(10*n.length()-1, n.charAt(0)-1+9*(n.length()-1));
        System.out.println(result);
    }
}