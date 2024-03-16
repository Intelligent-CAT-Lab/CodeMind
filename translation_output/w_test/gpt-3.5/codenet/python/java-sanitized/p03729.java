import java.util.Scanner;

public class p03729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        
        String a = words[0];
        String b = words[1];
        String c = words[2];
        
        if (a.charAt(a.length()-1) == b.charAt(0) && b.charAt(b.length()-1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}