import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        String a = parts[0];
        StringBuilder b = new StringBuilder(parts[1]);
        b.reverse(); // reverse the string
        
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b.toString());
        
        System.out.println(aInt + bInt);
        
        scanner.close();
    }
}